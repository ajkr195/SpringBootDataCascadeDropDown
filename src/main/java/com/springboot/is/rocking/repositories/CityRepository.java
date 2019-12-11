package com.springboot.is.rocking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.is.rocking.model.City;
import com.springboot.is.rocking.model.CityEntity;

@Repository("cityRepository")
public interface CityRepository extends CrudRepository<City, Long> {

	@Query("select new com.springboot.is.rocking.model.CityEntity(id, name) from City where state.id = :id")
	public List<CityEntity> findByState(@Param("id") long id);

}