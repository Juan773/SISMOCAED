package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Apro_post;

@Repository
public interface Apro_postDao extends CrudRepository<Apro_post, Long>{

}
