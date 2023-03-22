package com.altrocks.model;

public class ExcelField {

	private String excelColumnName;
	private Integer excelColIndex;
	private String excelColType;
	private String excelColValue;
	private String entityAttribute;
	private String enabled;
	
	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getExcelColumnName() {
		return excelColumnName;
	}

	public void setExcelColumnName(String excelColumnName) {
		this.excelColumnName = excelColumnName;
	}

	public Integer getExcelColIndex() {
		return excelColIndex;
	}

	public void setExcelColIndex(Integer excelColIndex) {
		this.excelColIndex = excelColIndex;
	}

	public String getExcelColType() {
		return excelColType;
	}

	public void setExcelColType(String excelColType) {
		this.excelColType = excelColType;
	}

	public String getExcelColValue() {
		return excelColValue;
	}

	public void setExcelColValue(String excelColValue) {
		this.excelColValue = excelColValue;
	}

	public String getEntityAttribute() {
		return entityAttribute;
	}

	public void setEntityAttribute(String entityAttribute) {
		this.entityAttribute = entityAttribute;
	}
	
	

}