package com.healthcode.model;

import org.springframework.data.annotation.Id;

public abstract class ModelEntity{

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
