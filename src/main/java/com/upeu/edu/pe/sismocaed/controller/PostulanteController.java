package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Postulante;
import com.upeu.edu.pe.sismocaed.service.PostulanteService;

@RequestMapping("/apisis")
@RestController
public class PostulanteController {

	@Autowired
	private PostulanteService postulanteService;
	
	@GetMapping("/postulante")
	public List<Postulante> findAll(){
		return (List<Postulante>) postulanteService.findAll();
	}
	
	@GetMapping("/postulante/{idpostulante}")
	public Postulante read(@PathVariable Long idpostulante) {
		return postulanteService.findById(idpostulante);
	}
	

	@PostMapping("/savepost")
	@ResponseStatus(HttpStatus.CREATED)
	public Postulante create(@RequestBody Postulante postulante) {
		return postulanteService.save(postulante);
	}
	

	@PutMapping("/editpost/{idpostulante}")
	public Postulante update(@RequestBody Postulante postulante, @PathVariable Long idpostulante) {
	   Postulante editar_postulante = postulanteService.findById(idpostulante);
	   editar_postulante.setCodigo(postulante.getCodigo());
	   editar_postulante.setEscuela_p(postulante.getEscuela_p());
	   editar_postulante.setProfesion(postulante.getProfesion());
	   editar_postulante.setGrado(postulante.getGrado());
	   editar_postulante.setEstado(postulante.getEstado());
	   editar_postulante.setIdpersona(postulante.getIdpersona());
	   
	   return postulanteService.save(editar_postulante);
	}
	

	@DeleteMapping("/deletespost/{idpostulante}")
	public void delete(@PathVariable Long idpostulante) {
		postulanteService.delete(idpostulante);
	}
}
