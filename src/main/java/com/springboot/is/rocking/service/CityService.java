package com.springboot.is.rocking.service;

import java.util.List;

import com.springboot.is.rocking.model.City;

public interface CityService {

	public List<City> findByState(int id);

}