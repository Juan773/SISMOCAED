package com.upeu.edu.pe.sismocaed.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;

@Repository
public interface Requisitos_aDao extends CrudRepository<Requisitos_a, Long>{

    @Query(value = "call Formato_F102()", nativeQuery = true)
	List<Requisitos_a> listprocedure();
}
