package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Trabajador;
public interface TrabajadorService {
	   public List<Trabajador>findAll();
	   public Trabajador findById(Long idtrabajador);
	   public Trabajador save(Trabajador trabajador);
	   public void delete (Long idtrabajador);
}
