package com.springboot.is.rocking.service;

import java.util.List;

import com.springboot.is.rocking.model.State;

public interface StateService {

	public List<State> findByCountry(int id);

}