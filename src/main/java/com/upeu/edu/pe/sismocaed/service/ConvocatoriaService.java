package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Convocatoria;

public interface ConvocatoriaService {

	public List<Convocatoria> findAll();
	public Convocatoria findById(Long idconvocatoria);
	public Convocatoria save(Convocatoria convocatoria);
	public void delete(Long idconvocatoria);
}
