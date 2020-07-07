package com.upeu.edu.pe.sismocaed.service;

import java.util.List;
import com.upeu.edu.pe.sismocaed.entity.Universidad;

public interface UniversidadService {

	public List<Universidad> findAll();
	public Universidad findById(Long iduniversidad);
	public Universidad save(Universidad universidad);
	public void delete (Long iduniversidad);
}
