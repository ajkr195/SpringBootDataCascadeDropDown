package com.springboot.is.rocking.model;

import java.io.Serializable;

public class StateEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public StateEntity() {
	}

	public StateEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}