package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Postulante;

@Repository
public interface PostulanteDao extends CrudRepository<Postulante, Long>{

}
