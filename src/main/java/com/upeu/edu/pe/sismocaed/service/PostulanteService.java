package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Postulante;

public interface PostulanteService {

	public List<Postulante> findAll();
	public Postulante findById(Long idaprobacion);
	public Postulante save(Postulante postulante);
	public void delete(Long idpostulante);
}
