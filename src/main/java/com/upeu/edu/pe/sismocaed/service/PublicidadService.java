package com.upeu.edu.pe.sismocaed.service;
import java.util.List;
import java.util.Optional;

import com.upeu.edu.pe.sismocaed.entity.Publicidad;



public interface PublicidadService {
	public List<Publicidad>findAll();
	public Publicidad findById(Long idpublicidad);
	public Publicidad save(Publicidad publicidad);
	public void delete (Long idpublicidad);
	public Optional<Publicidad> findById1(Long idpublicidad);
}
