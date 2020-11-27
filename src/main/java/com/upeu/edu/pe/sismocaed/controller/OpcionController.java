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

import com.upeu.edu.pe.sismocaed.entity.Opcion;

import com.upeu.edu.pe.sismocaed.service.OpcionService;

@RequestMapping("/apisis")
@RestController
public class OpcionController {
	@Autowired
	private OpcionService opcionService;
	@GetMapping("/opcion")
	public List<Opcion>readAll(){
		return (List<Opcion>) opcionService.findAll();
	}
	@GetMapping("opcion/{idopcion}")
	public Opcion read (@PathVariable Long idopcion) {
		return opcionService.findById(idopcion);
		
	}
	

	@PostMapping("/opcion")
	@ResponseStatus(HttpStatus.CREATED)
	public Opcion create (@RequestBody Opcion opcion) {
		return opcionService.save(opcion);
		
	}
	

	@PutMapping("/editar/{idopcion}")
	public Opcion update(@RequestBody Opcion opcion, @PathVariable Long idopcion) {
		Opcion editar_opcion = opcionService.findById(idopcion);
		       editar_opcion.setDescripcion(opcion.getDescripcion());
		       editar_opcion.setEnlace(opcion.getEnlace());
		       editar_opcion.setEstado(opcion.getEstado());
		       editar_opcion.setIcono(opcion.getOpcion());
               editar_opcion.setOpcion(opcion.getOpcion());
               editar_opcion.setOrden(opcion.getOrden());
               editar_opcion.setTipo(opcion.getTipo());
               
		return opcionService.save(editar_opcion);
		
	}
	

	@DeleteMapping("eliminaropcion/{idopcion}")
	public void delete(@PathVariable Long idopcion) {
		opcionService.delete(idopcion);
	  
        System.out.print("Opcion Borrada");
	}

}
