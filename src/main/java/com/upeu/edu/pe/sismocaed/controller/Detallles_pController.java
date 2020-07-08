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

import com.upeu.edu.pe.sismocaed.entity.Detalles_p;
import com.upeu.edu.pe.sismocaed.service.Detalles_pService;

@RequestMapping("/apisis")
@RestController
public class Detallles_pController {

	@Autowired
	private Detalles_pService detalles_pService;
	
	@GetMapping("/detalles_p")
	public List<Detalles_p> findAll(){
		return (List<Detalles_p>) detalles_pService.findAll();
	}
	
	@GetMapping("/detalles_p/{iddetalle_p}")
	public Detalles_p read(@PathVariable Long iddetalle_p) {
		return detalles_pService.findById(iddetalle_p);
	}
	
	@PostMapping("/savedetalles_p")
	@ResponseStatus(HttpStatus.CREATED)
	public Detalles_p create(@RequestBody Detalles_p detalles_p) {
		return detalles_pService.save(detalles_p);
	}
	
	@PutMapping("/editdetalles_p")
	public Detalles_p update(@RequestBody Detalles_p detalles_p, @PathVariable Long iddetalle_p) {
		Detalles_p editar_detalles_p = detalles_pService.findById(iddetalle_p);
		
		editar_detalles_p.setDocumento(detalles_p.getDocumento());
		editar_detalles_p.setDetalle(detalles_p.getDetalle());
		editar_detalles_p.setIdpostulante(detalles_p.getIdpostulante());
		
		return detalles_pService.save(editar_detalles_p);
	}
	
	@DeleteMapping("/deletedeta_p")
	public void delete(@PathVariable Long iddetalle_p) {
		detalles_pService.delete(iddetalle_p);
	}
}
