package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Solicitud_docente;

import com.upeu.edu.pe.sismocaed.service.Solicitud_docenteService;

@RequestMapping("/apisis")
@RestController
public class Solicitud_docenteController {
	
	@Autowired
	private Solicitud_docenteService solicitud_docenteService;
	
	@GetMapping("/sol_doc")
	public List<Solicitud_docente>findAll(){
		return (List<Solicitud_docente>) solicitud_docenteService.findAll();
	}
	@GetMapping("/sol_doc/{idsol_doc}")
	public Solicitud_docente read(@PathVariable Long idsol_doc) {
		return solicitud_docenteService.findById(idsol_doc);
	}
	@PostMapping("/sol_docpost")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitud_docente create(@RequestBody Solicitud_docente solicitud_docente) {
		return solicitud_docenteService.save(solicitud_docente);
	}
	@PutMapping("/edit_sol_doc/{idsol_doc}")
	public Solicitud_docente update(@RequestBody Solicitud_docente solicitud_docente, @PathVariable Long idsol_doc) {
		Solicitud_docente editar_solicitud_docente = solicitud_docenteService.findById(idsol_doc);
		editar_solicitud_docente.setSolicitud_mad(solicitud_docente.getSolicitud_mad());
		editar_solicitud_docente.setCarta_m(solicitud_docente.getCarta_m());
		editar_solicitud_docente.setCv(solicitud_docente.getCv());
	   
	   return solicitud_docenteService.save(editar_solicitud_docente);
	}

	@DeleteMapping("/deletesol_doc/{idsol_doc}")
	public void delete(@PathVariable Long idsol_doc) {
		solicitud_docenteService.delete(idsol_doc);
	}
	

}
