package com.altrocks.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.altrocks.enums.ExcelSection;
import com.altrocks.mapper.ExcelFieldMapper;
import com.altrocks.model.BaseEntity;
import com.altrocks.model.ExcelField;
import com.altrocks.model.HR001;
import com.altrocks.reader.ExcelFileReader;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Component
public class AltrocksUtil {
	
	  @Autowired 
	  private Environment env;
	  
	  public AltrocksUtil(Environment env) {
		  this.env = env;
	  }


	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

	public static boolean hasExcelFormat(MultipartFile file) {

		if (!TYPE.equals(file.getContentType())) {
			return false;
		}

		return true;
	}
	
	

	@SuppressWarnings("unchecked")
	public List<BaseEntity> readExcelFile(String filePath, String type) throws Exception {
		

		List list = new ArrayList<>();

		try {
			Workbook workbook = ExcelFileReader.readExcel(filePath, type);
			Sheet sheet = workbook.getSheetAt(0);

			Map<String, List<ExcelField[]>> excelRowValuesMap = ExcelFileReader.getExcelRowValues(sheet);

			excelRowValuesMap.forEach((section, rows) -> {

				System.out.println(section);
				System.out.println("==============");

				boolean headerPrint = true;
				for (ExcelField[] evc : rows) {
					if (headerPrint) {
						for (int j = 0; j < evc.length; j++) {
							System.out.print(evc[j].getExcelColumnName() + "\t");
						}
						/*
						 * System.out.println(); System.out.println(
						 * "------------------------------------------------------------------------------------"
						 * ); System.out.println();
						 */
						headerPrint = false;
					}
					for (int j = 0; j < evc.length; j++) {
						System.out.print(evc[j].getExcelColValue() + "\t");

					}
					System.out.println();
				}
				System.out.println();
			});

			
			String PropertyName = "class.name.entity";
			String propertyValue = env.getProperty(PropertyName);

			
				List<BaseEntity> dataList1 = (List<BaseEntity>) ExcelFieldMapper
						.getPojos(excelRowValuesMap.get(propertyValue), Class.forName(propertyValue));
				list.addAll(dataList1);
			

			workbook.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;

	}

}

//List i =
// ExcelFieldMapper.getPojos(excelRowValuesMap.get(entityVal.getClass()),
// entityVal.getClass());

/*
 * List<HR001> dataList1;
 * 
 * // List<HR001> entity = Class.forName(inboundEntityClassName).newInstance();
 * if(Type.contentEquals("HR001")) { dataList1 =
 * ExcelFieldMapper.getPojos(excelRowValuesMap.get(ExcelSection.HR001.getValue()
 * ), HR001.class); }else if(Type.contentEquals("HR002")) { List<HR002>
 * dataList2 =
 * ExcelFieldMapper.getPojos(excelRowValuesMap.get(ExcelSection.HR002.getValue()
 * ), HR002.class); }else if(Type.contentEquals("HR003")) { List<HR003>
 * dataList3 =
 * ExcelFieldMapper.getPojos(excelRowValuesMap.get(ExcelSection.HR003.getValue()
 * ), HR003.class); }else { List<HR004> dataList4 =
 * ExcelFieldMapper.getPojos(excelRowValuesMap.get(ExcelSection.HR004.getValue()
 * ), HR004.class); }
 */
// List<HR001> inBoundList = ExcelFieldMapper.getPojos(()
/*
 * List<HR001> list1 = new ArrayList<>(); List<HR002> list2 = new ArrayList<>();
 * List<HR003> list3 = new ArrayList<>(); List<HR004> list4 = new ArrayList<>();
 * 
 */
/*
 * orders.forEach(o -> {
 * System.out.println("Customer Name :"+o.getCustomerName()+", Order Number : "
 * +o.getOrderNumber()
 * +", Customer service type : "+o.getCustomerServiceType()); });
 */