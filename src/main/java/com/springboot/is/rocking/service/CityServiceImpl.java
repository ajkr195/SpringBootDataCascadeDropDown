package com.springboot.is.rocking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.is.rocking.model.City;
import com.springboot.is.rocking.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findByState(int id) {
		return cityRepository.findByState(id);
	}

}