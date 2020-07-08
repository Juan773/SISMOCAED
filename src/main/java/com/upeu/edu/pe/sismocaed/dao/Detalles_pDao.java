package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Detalles_p;

@Repository
public interface Detalles_pDao extends CrudRepository<Detalles_p, Long>{

}
