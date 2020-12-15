package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Solicitud_docente;


public interface Solicitud_docenteService {
       public List<Solicitud_docente>findAll();
	   public Solicitud_docente findById(Long idsol_doc);
	   public Solicitud_docente save(Solicitud_docente solicitud_docente);
	   public void delete (Long idsol_doc);
       
}
