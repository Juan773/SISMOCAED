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

import com.upeu.edu.pe.sismocaed.entity.Aprobacion;
import com.upeu.edu.pe.sismocaed.service.AprobacionService;

@RequestMapping("/apisis")
@RestController
public class AprobacionController {

	@Autowired
	private AprobacionService aprobacionService;
	
	@GetMapping("/aprobacion")
	public List<Aprobacion> findAll(){
		return (List<Aprobacion>) aprobacionService.findAll();
	}
	
	@GetMapping("/aprobacion/{idaprobacion}")
	public Aprobacion read(@PathVariable Long idaprobacion) {
		return aprobacionService.findById(idaprobacion);
	}
	
	@PostMapping("/saveapro")
	@ResponseStatus(HttpStatus.CREATED)
	public Aprobacion create(@RequestBody Aprobacion aprobacion) {
		return aprobacionService.save(aprobacion);
	}
	
	@PutMapping("/editapro/{idaprobacion}")
	public Aprobacion update(@RequestBody Aprobacion aprobacion, @PathVariable Long idaprobacion) {
		Aprobacion editar_aprobacion = aprobacionService.findById(idaprobacion);
		
		editar_aprobacion.setCodigo(aprobacion.getCodigo());
		editar_aprobacion.setFecha(aprobacion.getFecha());
		editar_aprobacion.setDoc_apro(aprobacion.getDoc_apro());
		editar_aprobacion.setIdconvocatoria(aprobacion.getIdconvocatoria());
		
		return aprobacionService.save(editar_aprobacion);
	}
	
	@DeleteMapping("/deleteapro/{idaprobacion}")
	public void delete(@PathVariable Long idaprobacion) {
		aprobacionService.delete(idaprobacion);
	}
}
