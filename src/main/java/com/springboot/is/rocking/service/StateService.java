package com.springboot.is.rocking.service;

import java.util.List;

import com.springboot.is.rocking.model.StateEntity;

public interface StateService {

	public List<StateEntity> findByCountry(int id);

}