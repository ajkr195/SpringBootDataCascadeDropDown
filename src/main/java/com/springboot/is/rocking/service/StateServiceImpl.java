package com.springboot.is.rocking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.is.rocking.model.StateEntity;
import com.springboot.is.rocking.repositories.StateRepository;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<StateEntity> findByCountry(int id) {
		return stateRepository.findByCountry(id);
	}

}