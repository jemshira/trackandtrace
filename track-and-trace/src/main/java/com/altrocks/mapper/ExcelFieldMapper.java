package com.altrocks.mapper;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import com.altrocks.enums.FieldType;
import com.altrocks.model.ExcelField;

public class ExcelFieldMapper {

	final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSX");

	final static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSX");

	public static <T> List<T> getPojos(List<ExcelField[]> excelFields, Class<T> clazz) {

		List<T> list = new ArrayList<>();
		excelFields.forEach(evc -> {

			T t = null;

			try {
				t = clazz.getConstructor().newInstance();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			Class<? extends Object> classz = t.getClass();

			for (int i = 0; i < evc.length; i++) {
				for (Field field : classz.getDeclaredFields()) {
					field.setAccessible(true);

					if (evc[i].getEntityAttribute().equalsIgnoreCase(field.getName())) {
						
						try {

							if (FieldType.STRING.getValue().equalsIgnoreCase(evc[i].getExcelColType())) {
								field.set(t, evc[i].getExcelColValue());
							} else if (FieldType.DOUBLE.getValue().equalsIgnoreCase(evc[i].getExcelColType())) {
								field.set(t, Double.valueOf(evc[i].getExcelColValue()));
							} else if (FieldType.INTEGER.getValue().equalsIgnoreCase(evc[i].getExcelColType())) {
								field.set(t, Double.valueOf(evc[i].getExcelColValue()).intValue());
							} else if (evc[i].getExcelColValue() != null && !(evc[i].getExcelColValue().isEmpty())
									&& FieldType.DATE.getValue().equalsIgnoreCase(evc[i].getExcelColType())) {
								field.set(t, sdf.parse(evc[i].getExcelColValue()));
							}

						} catch (IllegalArgumentException | IllegalAccessException e) {
							e.printStackTrace();
							 //System.out.println("Error parsing date: " + e.getMessage());
						} catch (ParseException e) {
							e.printStackTrace();
						}

						break;
					}
				}
			}

			list.add(t);
		});

		return list;
	}

}
