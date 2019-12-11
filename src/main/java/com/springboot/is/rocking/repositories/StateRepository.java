package com.springboot.is.rocking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.is.rocking.model.State;

@Repository("stateRepository")
public interface StateRepository extends CrudRepository<State, Long> {

	@Query("select new State(id, name) from State where country.id = :id")

	public List<State> findByCountry(@Param("id") long id);
	
//	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")

}