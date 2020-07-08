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

import com.upeu.edu.pe.sismocaed.entity.E_Profesional;
import com.upeu.edu.pe.sismocaed.service.E_ProfesionalService;

@RequestMapping("/apisis")
@RestController
public class E_ProfesionalController {
	@Autowired
	private E_ProfesionalService e_profesionalService;

	@GetMapping("/e_profesional")
	public List<E_Profesional> readAll(){
		return (List<E_Profesional>) e_profesionalService.findAll();
	}
	
	@GetMapping("/e_pro/{ide_profesional}")
	public E_Profesional read(@PathVariable Long ide_profesional) {
		return e_profesionalService.findById(ide_profesional);
	}
	
	@PostMapping("/savee_p")
	@ResponseStatus(HttpStatus.CREATED)
	public E_Profesional create(@RequestBody E_Profesional e_profesional) {
		return e_profesionalService.save(e_profesional);
	}
	
	@PutMapping("/edite_profesional/{ide_profesional}")
	public E_Profesional update(@RequestBody E_Profesional e_profesional, @PathVariable Long ide_profesional) {
		E_Profesional editar_profesional = e_profesionalService.findById(ide_profesional);
		
		editar_profesional.setNombre(e_profesional.getNombre());
		editar_profesional.setFacultad(e_profesional.getFacultad());
		editar_profesional.setVacantes(e_profesional.getVacantes());
		editar_profesional.setIduniversidad(e_profesional.getIduniversidad());
		
		return e_profesionalService.save(e_profesional);
	}
	
	@DeleteMapping("/deletee_p/{ide_profesional}")
	public void delete(@PathVariable Long ide_profesional){
		e_profesionalService.delete(ide_profesional);
	}
}
