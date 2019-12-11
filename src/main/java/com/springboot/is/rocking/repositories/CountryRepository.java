package com.springboot.is.rocking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.is.rocking.model.Country;

@Repository("countryRepository")
public interface CountryRepository extends CrudRepository<Country, Long> {

}