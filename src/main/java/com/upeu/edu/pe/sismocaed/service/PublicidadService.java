package com.upeu.edu.pe.sismocaed.service;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;

import com.upeu.edu.pe.sismocaed.entity.Publicidad;

>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3

import com.upeu.edu.pe.sismocaed.entity.Publicidad;

public interface PublicidadService {
	public List<Publicidad>findAll();
	public Publicidad findById(Long idpublicidad);
	public Publicidad save(Publicidad publicidad);
	public void delete (Long idpublicidad);
<<<<<<< HEAD
	List<Publicidad> findByOrderById();
	
	

	
=======
	public Optional<Publicidad> findById1(Long idpublicidad);
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
}
