package com.altrocks.enums;

public enum ExcelSection {

	
	HR001("HR001"), 
	HR002("HR002"), 
	HR003("HR003"),
	HR004("HR004");
	
	
	final String typeValue;

	private ExcelSection(final String typeValue) {
		this.typeValue = typeValue;
	}

	public String getName() {
		return name();
	}

	public String getValue() {
		return typeValue;
	}

	@Override
	public String toString() {
		return name();
	}

}
