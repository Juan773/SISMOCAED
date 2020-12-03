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

import com.upeu.edu.pe.sismocaed.entity.Solicitud_va;
import com.upeu.edu.pe.sismocaed.service.Solicitud_vaService;

@RequestMapping("/apisis")
@RestController
public class Solicitud_vaController {
	@Autowired
	private Solicitud_vaService solicitudService;
	
	@GetMapping("/solicitud")
	public List<Solicitud_va> findAll(){
		return (List<Solicitud_va>) solicitudService.findAll();
	}
	
	@GetMapping("/solicitud/{idpsolicitud}")
	public Solicitud_va read(@PathVariable Long idpsolicitud) {
		return solicitudService.findById(idpsolicitud);
	}
	

	@PostMapping("/solicitud_va")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitud_va create(@RequestBody Solicitud_va solicitud) {
		return solicitudService.save(solicitud);
	}

	@PutMapping("/editpost/{idsolicitud}")
	public Solicitud_va update(@RequestBody Solicitud_va solicitud, @PathVariable Long idsolicitud) {
	   Solicitud_va editar_solicitud_va = solicitudService.findById(idsolicitud);
	   editar_solicitud_va.setSolicitud_mad(solicitud.getSolicitud_mad());
	   editar_solicitud_va.setCarta_m(solicitud.getCarta_m());
	   editar_solicitud_va.setCv(solicitud.getCv());
	   editar_solicitud_va.setTipo(solicitud.getTipo());
	   
	   return solicitudService.save(editar_solicitud_va);
	}
	

	@DeleteMapping("/deletespost/{idsolicitud}")
	public void delete(@PathVariable Long idsolicitud) {
		solicitudService.delete(idsolicitud);
	}
}