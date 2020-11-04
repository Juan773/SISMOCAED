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

import com.upeu.edu.pe.sismocaed.entity.Convocatoria;
import com.upeu.edu.pe.sismocaed.service.ConvocatoriaService;

@RequestMapping("/apisis")
@RestController
public class ConvocatoriaController {
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@GetMapping("/convocatoria")
	public List<Convocatoria> findAll(){
		return (List<Convocatoria>) convocatoriaService.findAll();
	}

	@GetMapping("/convocatoria/{idconvocatoria}")
	public Convocatoria read(@PathVariable Long idconvocatoria) {
		return convocatoriaService.findById(idconvocatoria);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/saveconvo")
	@ResponseStatus(HttpStatus.CREATED)
	public Convocatoria create(@RequestBody Convocatoria convocatoria) {
		return convocatoriaService.save(convocatoria);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editconvo/{idconvocatoria}")
	public Convocatoria update(@RequestBody Convocatoria convocatoria, @PathVariable Long idconvocatoria) {
		Convocatoria editar_convocatoria = convocatoriaService.findById(idconvocatoria);
		
		editar_convocatoria.setNombre_con(convocatoria.getNombre_con());
		editar_convocatoria.setFecha_ini(convocatoria.getFecha_ini());
		editar_convocatoria.setFecha_fin(convocatoria.getFecha_fin());
		editar_convocatoria.setDescripcion(convocatoria.getDescripcion());
		editar_convocatoria.setIdpublicidad(convocatoria.getIdpublicidad());
		
		return convocatoriaService.save(editar_convocatoria);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deleteconvo/{idconvocatoria}")	
	public void delete(@PathVariable Long idconvocatoria) {
		convocatoriaService.delete(idconvocatoria);
	}

}
