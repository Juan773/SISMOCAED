package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Convenio;

public interface ConvenioService {
	
  public List<Convenio> findAll();
  public Convenio findById(Long idconvenio);
  public Convenio save(Convenio convenio);
  public void delete(Long idconvenio);
}
