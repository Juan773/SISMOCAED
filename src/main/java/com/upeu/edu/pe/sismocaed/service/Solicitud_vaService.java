package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Solicitud_va;

public interface Solicitud_vaService {
	   public List<Solicitud_va>findAll();
	   public Solicitud_va findById(Long idsolicitud);
	   public Solicitud_va save(Solicitud_va solicitud);
	   public void delete (Long idsolicitud);
}