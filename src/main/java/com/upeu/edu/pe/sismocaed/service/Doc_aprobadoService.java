package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Doc_aprobado;

public interface Doc_aprobadoService {
	   public List<Doc_aprobado>findAll();
	   public Doc_aprobado findById(Long iddoc_aprobado);
	   public Doc_aprobado save(Doc_aprobado doc_aprobado);
	   public void delete (Long iddoc_aprobado);

}
