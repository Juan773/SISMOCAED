package com.upeu.edu.pe.sismocaed.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.sismocaed.security.entity.Rol;
import com.upeu.edu.pe.sismocaed.security.enums.RolNombre;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
