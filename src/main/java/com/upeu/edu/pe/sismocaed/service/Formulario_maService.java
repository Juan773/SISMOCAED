package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Formulario_ma;

public interface Formulario_maService {
	   public List<Formulario_ma>findAll();
	   public Formulario_ma findById(Long idformulario_ma);
	   public Formulario_ma save(Formulario_ma formulario_ma);
	   public void delete (Long idformulario_ma);
}
