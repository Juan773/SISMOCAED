package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Vacantes;

@Repository
public interface VacantesDao extends CrudRepository<Vacantes, Long>{

}
