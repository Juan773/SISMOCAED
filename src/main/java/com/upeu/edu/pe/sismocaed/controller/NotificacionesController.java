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

import com.upeu.edu.pe.sismocaed.entity.Notificaciones;
import com.upeu.edu.pe.sismocaed.service.NotificacionesService;

@RequestMapping("/apisis")
@RestController
public class NotificacionesController {

	@Autowired
	private NotificacionesService notificacionesService;

	@GetMapping("/notificaciones")
	public List<Notificaciones> findAll(){
		return (List<Notificaciones>) notificacionesService.findAll();
	}
	
	@GetMapping("/notificaciones/{idnotificacion}")
	public Notificaciones read(@PathVariable Long idnotificacion) {
		return notificacionesService.findById(idnotificacion);
	}
	
	@PostMapping("/savenoti")
	@ResponseStatus(HttpStatus.CREATED)
	public Notificaciones create(@RequestBody Notificaciones notificaciones) {
		return notificacionesService.save(notificaciones);
	}
	
	@PutMapping("/editnoti/{idnotificacion}")
	public Notificaciones update(@RequestBody Notificaciones notificaciones, @PathVariable Long idnotificacion){
		Notificaciones editar_notificaciones = notificacionesService.findById(idnotificacion);
		
		editar_notificaciones.setTitulo(notificaciones.getTitulo());
		editar_notificaciones.setDescripcion(notificaciones.getDescripcion());
		editar_notificaciones.setFecha(notificaciones.getFecha());
		editar_notificaciones.setIdpostulante(notificaciones.getIdpostulante());

	    return notificacionesService.save(editar_notificaciones);
	}
	
	@DeleteMapping("/deletenoti/{idnotificacion}")
	public void delete(@PathVariable Long idnotificacion) {
		notificacionesService.delete(idnotificacion);
	}
 }

