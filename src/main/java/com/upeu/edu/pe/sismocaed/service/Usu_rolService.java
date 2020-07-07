package com.upeu.edu.pe.sismocaed.service;
import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Usu_rol;

public interface Usu_rolService {
	   public List<Usu_rol>findAll();
	   public Usu_rol findById(Long idusu_rol);
	   public Usu_rol save(Usu_rol usu_rol);
	   public void delete (Long idusu_rol);
}
