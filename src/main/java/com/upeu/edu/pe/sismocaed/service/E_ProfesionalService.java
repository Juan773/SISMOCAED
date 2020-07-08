package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.E_Profesional;

public interface E_ProfesionalService {
	
	public List<E_Profesional> findAll();
	public E_Profesional findById(Long ide_profesional);
	public E_Profesional save(E_Profesional e_profesional);
	public void delete(Long ide_profesional);

}
