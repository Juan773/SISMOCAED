package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.upeu.edu.pe.sismocaed.entity.Convenio;
import com.upeu.edu.pe.sismocaed.service.ConvenioService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class ConvenioController {
	@Autowired
	private ConvenioService convenioServive;
	
	@GetMapping("/convenio")
	public List<Convenio> readAll(){
		return (List<Convenio>) convenioServive.findAll();
	}
	
	@GetMapping("/convenio/{idconvenio}")
	public Convenio read (@PathVariable Long idconvenio) {
		return convenioServive.findById(idconvenio);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/saveconv")
	@ResponseStatus(HttpStatus.CREATED)
	public Convenio create(@Valid @RequestBody Convenio convenio) {
		return convenioServive.save(convenio);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editconv/{idconvenio}")
	public Convenio update(@RequestBody Convenio convenio, @PathVariable Long idconvenio) {
		Convenio editar_convenio = convenioServive.findById(idconvenio);
		
		editar_convenio.setN_documento(convenio.getN_documento());
		editar_convenio.setFecha_inicio(convenio.getFecha_inicio());
		editar_convenio.setFecha_fin(convenio.getFecha_fin());
		editar_convenio.setIduniversidad(convenio.getIduniversidad());
		
		return convenioServive.save(editar_convenio);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deleteconv/{idconvenio}")
	public void delete(@PathVariable Long idconvenio) {
		convenioServive.delete(idconvenio);
	}

}
