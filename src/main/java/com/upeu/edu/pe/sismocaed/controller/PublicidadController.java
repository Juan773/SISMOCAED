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


import com.upeu.edu.pe.sismocaed.entity.Publicidad;


import com.upeu.edu.pe.sismocaed.service.PublicidadService;

@RequestMapping("/apisis")
@RestController
public class PublicidadController {
	@Autowired
	private PublicidadService publicidadService;
	@GetMapping("/publicidad")
	public List<Publicidad>readAll(){
		return (List<Publicidad>) publicidadService.findAll();
	}
	@GetMapping("/")
	public String index( ) {
		return "uploadFileView";
	}

	
	
	@GetMapping("publicidad/{idpublicidad}")
	public Publicidad read (@PathVariable Long idpublicidad) {
		return publicidadService.findById(idpublicidad);
		
	}
	@PostMapping("/publicidad")
	@ResponseStatus(HttpStatus.CREATED)
	public Publicidad create (@RequestBody Publicidad publicidad) {
		return publicidadService.save(publicidad);
		
	}
	@PutMapping("/editar/{idpublicidad}")
	public Publicidad update(@RequestBody Publicidad publicidad, @PathVariable Long idpublicidad) {
		Publicidad editar_publicidad = publicidadService.findById(idpublicidad);
		editar_publicidad.setTitulo(publicidad.getTitulo());
		editar_publicidad.setUrl_imagen(publicidad.getUrl_imagen());
		editar_publicidad.setEstado(publicidad.getEstado());
		return publicidadService.save(editar_publicidad);
		
	}
	@DeleteMapping("eliminarpublicidad/{idpublicidad}")
	public void delete(@PathVariable Long idpublicidad) {
		publicidadService.delete(idpublicidad);
	  
        System.out.print("Rol Borrado");
	}

}
