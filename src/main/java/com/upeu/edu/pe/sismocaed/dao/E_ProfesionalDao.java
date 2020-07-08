package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.E_Profesional;

@Repository
public interface E_ProfesionalDao extends CrudRepository<E_Profesional, Long>{

}
