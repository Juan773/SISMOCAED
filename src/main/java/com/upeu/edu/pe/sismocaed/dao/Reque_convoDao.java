package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Reque_convo;

@Repository
public interface Reque_convoDao extends CrudRepository<Reque_convo, Long>{

}
