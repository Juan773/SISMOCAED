package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Convenio;

@Repository
public interface ConvenioDao extends CrudRepository<Convenio, Long>{

}
