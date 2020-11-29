package com.upeu.edu.pe.sismocaed.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.entity.Rol;

@Repository
public interface RolDao extends CrudRepository<Rol, Long>{

	Collection<? extends GrantedAuthority> buscarRolUser(int idusuario);
	
	

}
