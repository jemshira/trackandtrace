package com.altrocks.model;

import java.util.Date;

public abstract class BaseEntity {

	private String entityClassName;

	public String getEntityClassName() {
		return entityClassName;
	}

	public void setEntityClassName(String entityClassName) {
		this.entityClassName = entityClassName;
	}
	
	

}
