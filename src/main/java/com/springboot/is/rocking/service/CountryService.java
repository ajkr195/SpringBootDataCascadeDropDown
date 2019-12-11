package com.springboot.is.rocking.service;

import com.springboot.is.rocking.model.Country;

public interface CountryService {

	public Iterable<Country> findAll();

	public Country find(int id);

}