package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Vacantes;
import com.upeu.edu.pe.sismocaed.service.VacantesService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class VacantesController {
	@Autowired
	private VacantesService vacantesService;
	
	@GetMapping("/vacante")
	public List<Vacantes> readAll() {
		return vacantesService.findAll();
	}
	
	@GetMapping("/vacantes/{idvacante}")
	public Vacantes read(@PathVariable Long idvacante) {
		return vacantesService.findById(idvacante);
	}
	
	@DeleteMapping("/deletevac/{idvacante}")
	public void delete(@PathVariable Long idvacante) {
		vacantesService.delete(idvacante);
	}

}
