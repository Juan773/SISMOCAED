package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;

public interface Requisitos_aService {

	public List<Requisitos_a> findAll();
	public Requisitos_a findById(Long idrequisitos_a);
	public Requisitos_a save(Requisitos_a requisitos_a);
	public void delete(Long idrequisitos_a);
}
