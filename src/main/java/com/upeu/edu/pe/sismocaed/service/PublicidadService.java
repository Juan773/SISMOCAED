package com.upeu.edu.pe.sismocaed.service;
import java.util.List;
import com.upeu.edu.pe.sismocaed.entity.Publicidad;



public interface PublicidadService {
	public List<Publicidad>findAll();
	public Publicidad findById(Long idpublicidad);
	public Publicidad save(Publicidad publicidad);
	public void delete (Long idpublicidad);
	
}
