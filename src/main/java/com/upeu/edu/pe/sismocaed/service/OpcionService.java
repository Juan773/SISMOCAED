package com.upeu.edu.pe.sismocaed.service;
import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Opcion;

public interface OpcionService {
	   public List<Opcion>findAll();
	   public Opcion findById(Long idopcion);
	   public Opcion save(Opcion opcion);
	   public void delete (Long idopcion);

}
