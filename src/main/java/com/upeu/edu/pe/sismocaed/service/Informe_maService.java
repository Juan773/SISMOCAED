package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Informe_ma;

public interface Informe_maService {
	   public List<Informe_ma>findAll();
	   public Informe_ma findById(Long idpersona);
	   public Informe_ma save(Informe_ma persona);
	   public void delete (Long idersona);

}
