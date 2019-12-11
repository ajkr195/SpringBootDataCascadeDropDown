package com.springboot.is.rocking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.is.rocking.model.CityEntity;
import com.springboot.is.rocking.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<CityEntity> findByState(int id) {
		return cityRepository.findByState(id);
	}

}