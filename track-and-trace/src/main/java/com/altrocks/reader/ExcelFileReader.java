package com.altrocks.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.altrocks.enums.FieldType;
import com.altrocks.model.ExcelField;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@Component
public final class ExcelFileReader {

	final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSX");
	final static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSX");

	private ExcelFileReader() {
	}

	public static Workbook readExcel(final String filePath, String type)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(new File(filePath));
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
		return wb;
	}

	public static Map<String, List<ExcelField[]>> getExcelRowValues(final Sheet sheet) {
		Map<String, List<ExcelField[]>> excelMap = new HashMap<>();
		Map<String, ExcelField[]> excelSectionHeaders = getExcelHeaderSections();
		int totalRows = sheet.getLastRowNum();
		excelSectionHeaders.forEach((section, excelFields) -> {
			System.out.println("inside excel row value");
			List<ExcelField[]> excelFieldList = new ArrayList<>();
			for (int i = 1; i <= totalRows; i++) {
				Row row = sheet.getRow(i);
				ExcelField[] excelFieldArr = new ExcelField[excelFields.length];
				int k = 0;
				for (ExcelField ehc : excelFields) {
					int cellIndex = ehc.getExcelColIndex();
					String cellType = ehc.getExcelColType();
					Cell cell = row.getCell(cellIndex);

					boolean isBlankCell = CellType.BLANK == cell.getCellType();
					boolean isEmptyStringCell = CellType.STRING == cell.getCellType()
							&& cell.getStringCellValue().trim().isEmpty();

					ExcelField excelField = new ExcelField();
					excelField.setExcelColType(ehc.getExcelColType());
					excelField.setExcelColumnName(ehc.getExcelColumnName());
					excelField.setExcelColIndex(ehc.getExcelColIndex());
					excelField.setEntityAttribute(ehc.getEntityAttribute());

					/*
					 * if(cell.getCellType() == null || cell.getStringCellValue() == null ||
					 * cell.getStringCellValue().isEmpty()) {
					 * excelField.setExcelColValue(cell.getStringCellValue()); }
					 */

					if (isEmptyStringCell) {
						excelField.setExcelColValue(cell.getStringCellValue());
					} else if (FieldType.STRING.getValue().equalsIgnoreCase(cellType)) {
						excelField.setExcelColValue(cell.getStringCellValue());
					} else if (FieldType.DOUBLE.getValue().equalsIgnoreCase(cellType)
							|| FieldType.INTEGER.getValue().equalsIgnoreCase(cellType)) {
						excelField.setExcelColValue(String.valueOf(cell.getNumericCellValue()));
					} else if (isBlankCell) {
						excelField.setExcelColValue(null);
					} else if (DateUtil.isCellDateFormatted(cell)) {
						excelField.setExcelColValue(String.valueOf(sdf.format(cell.getDateCellValue())));
					}

					excelFieldArr[k++] = excelField;
				}
				excelFieldList.add(excelFieldArr);
			}
			excelMap.put(section, excelFieldList);
		});
		return excelMap;
	}

//Cell cell = row.getCell(cellIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

	private static Map<String, ExcelField[]> getExcelHeaderSections() {
		List<Map<String, List<ExcelField>>> jsonConfigMap = getExcelHeaderFieldSections();
		Map<String, ExcelField[]> jsonMap = new HashMap<>();
		jsonConfigMap.forEach(jps -> {
			jps.forEach((section, values) -> {
				ExcelField[] excelFields = new ExcelField[values.size()];
				jsonMap.put(section, values.toArray(excelFields));
			});
		});
		return jsonMap;
	}

	private static List<Map<String, List<ExcelField>>> getExcelHeaderFieldSections() {
		List<Map<String, List<ExcelField>>> jsonMap = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String jsonConfig = new String(
					Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("HR001.json").toURI())));

			jsonMap = objectMapper.readValue(jsonConfig, new TypeReference<List<Map<String, List<ExcelField>>>>() {
			});
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		return jsonMap;
	}

}

/*
 * String filePath = jsonFileProp.getPath(); File file = null; try { file =
 * ResourceUtils.getFile(filePath); } catch (FileNotFoundException e1) { // TODO
 * Auto-generated catch block e1.printStackTrace(); }
 */

//String content = null;
//String content = new String(Files.readAllBytes(Paths.get(file.getPath())));