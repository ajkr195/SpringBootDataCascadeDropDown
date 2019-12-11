package com.springboot.is.rocking.model;

import java.io.Serializable;

public class StateEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	public StateEntity() {
	}

	public StateEntity(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}