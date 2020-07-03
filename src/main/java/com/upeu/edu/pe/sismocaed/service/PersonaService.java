package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Persona;
public interface PersonaService {
   public List<Persona>findAll();
   public Persona findById(Long idpersona);
   public Persona save(Persona persona);
   public void delete (Long idersona);

}
