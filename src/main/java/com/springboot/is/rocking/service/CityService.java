package com.springboot.is.rocking.service;

import java.util.List;

import com.springboot.is.rocking.model.CityEntity;

public interface CityService {

	public List<CityEntity> findByState(int id);

}