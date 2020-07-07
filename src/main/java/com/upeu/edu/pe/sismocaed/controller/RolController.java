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

import com.upeu.edu.pe.sismocaed.entity.Rol;
import com.upeu.edu.pe.sismocaed.service.RolService;
@RequestMapping("/apisis")
@RestController
public class RolController {
	@Autowired
	private RolService rolService;
	@GetMapping("/rol")
	public List<Rol>readAll(){
		return (List<Rol>) rolService.findAll();
	}
	@GetMapping("rol/{idrol}")
	public Rol read (@PathVariable Long idrol) {
		return rolService.findById(idrol);
		
	}
	@PostMapping("/rol")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol create (@RequestBody Rol rol) {
		return rolService.save(rol);
		
	}
	@PutMapping("/editar/{idrol}")
	public Rol update(@RequestBody Rol rol, @PathVariable Long idrol) {
		Rol editar_rol = rolService.findById(idrol);
            editar_rol.setNombre(rol.getNombre());
		    editar_rol.setEstado(rol.getEstado());
		return rolService.save(editar_rol);
		
	}
	@DeleteMapping("eliminarrol/{idrol}")
	public void delete(@PathVariable Long idrol) {
		rolService.delete(idrol);
	  
        System.out.print("Rol Borrado");
	}

}
