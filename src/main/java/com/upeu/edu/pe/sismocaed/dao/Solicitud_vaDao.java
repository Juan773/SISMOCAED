package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.upeu.edu.pe.sismocaed.entity.Solicitud_va;

@Repository
public interface Solicitud_vaDao extends CrudRepository<Solicitud_va, Long>{

}
