package com.upeu.edu.pe.sismocaed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long>{

	//Usuario findAll(String name);

	Usuario findByUsername(String username);

	
}
