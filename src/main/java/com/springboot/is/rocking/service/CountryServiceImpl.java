package com.springboot.is.rocking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.is.rocking.model.Country;
import com.springboot.is.rocking.repositories.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Iterable<Country> findAll() {
		return countryRepository.findAll();
	}

	@Override
	public Country findCountry(long id) {
		return countryRepository.findById(id).get();
	}

}