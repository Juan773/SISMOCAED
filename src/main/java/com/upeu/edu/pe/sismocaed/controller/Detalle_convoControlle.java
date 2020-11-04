package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
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

import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;
import com.upeu.edu.pe.sismocaed.service.Detalle_convoService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class Detalle_convoControlle {

	@Autowired
	private Detalle_convoService detalle_convoService;
	
	@GetMapping("/detalle_convo")
	public List<Detalle_convo> readAll(){
		return (List<Detalle_convo>) detalle_convoService.findAll();
	}
	
	@GetMapping("/detalle_convo/{iddetalle_convo}")
	public Detalle_convo read(@PathVariable Long iddetalle_convo) {
		return detalle_convoService.findById(iddetalle_convo);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/savedeta_conv")
	@ResponseStatus(HttpStatus.CREATED)
	public Detalle_convo create(@RequestBody Detalle_convo detalle_convo){
		return detalle_convoService.save(detalle_convo);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editdeta_conv/{iddetalle_convo}")
	public Detalle_convo update(@RequestBody Detalle_convo detalle_convo, @PathVariable Long iddetalle_convo) {
		Detalle_convo editar_convo = detalle_convoService.findById(iddetalle_convo);
		
	    editar_convo.setUrl_solicitud(detalle_convo.getUrl_solicitud());
	    editar_convo.setFecha(detalle_convo.getFecha());;
	    editar_convo.setUrl_carta(detalle_convo.getUrl_carta());
	    editar_convo.setUrl_curriculum(detalle_convo.getUrl_curriculum());
	    editar_convo.setDescripcion(detalle_convo.getDescripcion());
	    editar_convo.setIdconvocatoria(detalle_convo.getIdconvocatoria());
	    editar_convo.setIdpostulante(detalle_convo.getIdpostulante());
	    
	    return detalle_convoService.save(editar_convo);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deletedeta_conv")
	public void delete(@PathVariable Long iddetalle_convo) {
		detalle_convoService.delete(iddetalle_convo);
	}
}
