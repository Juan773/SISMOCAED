package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Detalles_p;

public interface Detalles_pService {

	public List<Detalles_p> findAll();
	public Detalles_p findById(Long iddetalle_p);
	public Detalles_p save(Detalles_p detalles_p);
	public void delete(Long iddetalle_p);
}
