package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Solicitud_docente;
@Repository

public interface Solicitud_docenteDao extends CrudRepository<Solicitud_docente,Long>{

}
