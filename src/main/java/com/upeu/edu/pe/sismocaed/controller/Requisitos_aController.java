package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;
import com.upeu.edu.pe.sismocaed.service.Requisitos_aService;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/apisis")
@RestController
public class Requisitos_aController {

	@Autowired
	private Requisitos_aService requisitos_aService;
	
	@GetMapping("/requisitos_a")
	public List<Requisitos_a> readAll(){
		return (List<Requisitos_a>) requisitos_aService.findAll();
 	}
	
	@GetMapping("/requisitos_a/{idrequisitos_a}")
	public Requisitos_a read(@PathVariable Long idrequisitos_a) {
		return requisitos_aService.findById(idrequisitos_a);
	}
	
	@PostMapping("/savereque_a")
	@ResponseStatus(HttpStatus.CREATED)
	public Requisitos_a create(@RequestBody Requisitos_a requisitos_a) {
		return requisitos_aService.save(requisitos_a);
	}
	
	@PutMapping("/editreque_a/{idrequisitos_a}")
	public Requisitos_a update(@RequestBody Requisitos_a requisitos_a, @PathVariable Long idrequisitos_a) {
		Requisitos_a editar_requisitos_a = requisitos_aService.findById(idrequisitos_a);
		
		editar_requisitos_a.setDescripcion(requisitos_a.getDescripcion());
		editar_requisitos_a.setDocumentos(requisitos_a.getDocumentos());
		editar_requisitos_a.setIde_profesional(requisitos_a.getIde_profesional());
		
		return requisitos_aService.save(editar_requisitos_a);
	}
	
    @DeleteMapping("/deletereq_a/{idrequisitos_a}")
    public void delete(@PathVariable Long idrequisitos_a) {
    	requisitos_aService.delete(idrequisitos_a);
    }
    
    @GetMapping("/req_a_procedure")
    public List<Requisitos_a> getReq_aProcedure(){
    	return requisitos_aService.getReq_aProcedure();
    }
    
}
