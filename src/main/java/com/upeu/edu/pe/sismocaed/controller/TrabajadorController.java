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
import com.upeu.edu.pe.sismocaed.entity.Trabajador;
import com.upeu.edu.pe.sismocaed.service.TrabajadorService;
@RequestMapping("/apisis")
@RestController
public class TrabajadorController {

	@Autowired
	private TrabajadorService trabajadorService;
	@GetMapping("/trabajador")
	public List <Trabajador>readAll(){
		return  (List<Trabajador>) trabajadorService.findAll();
	}
	@GetMapping("trabajador/{idtrabajador}")
	public Trabajador read (@PathVariable Long idtrabajador) {
		return trabajadorService.findById(idtrabajador);
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/trabajador")
	@ResponseStatus(HttpStatus.CREATED)
	public Trabajador create (@RequestBody Trabajador trabajador) {
		return trabajadorService.save(trabajador);
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{idtrabajador}")
	public Trabajador update(@RequestBody Trabajador trabajador, @PathVariable Long idtrabajador) {
		Trabajador editar_trabajador = trabajadorService.findById(idtrabajador);

		editar_trabajador.setCargo(trabajador.getCargo());
		editar_trabajador.setProfesion(trabajador.getProfesion());
		editar_trabajador.setIdpersona(trabajador.getIdpersona());
		
		return trabajadorService.save(editar_trabajador);
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminartrabajador/{idtrabajador}")
	public void delete(@PathVariable Long idtrabajador) {
	trabajadorService.delete(idtrabajador);
	  
        System.out.print("Trabajador Borrado");
	}
}
