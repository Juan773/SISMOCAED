package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Aprobacion;

public interface AprobacionService {

	public List<Aprobacion> findAll();
	public Aprobacion findById(Long idaprobacion);
	public Aprobacion save(Aprobacion aprobacion);
	public void delete(Long idaaprobacion);
}
