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

import com.upeu.edu.pe.sismocaed.entity.Usu_rol;

import com.upeu.edu.pe.sismocaed.service.Usu_rolService;

@RequestMapping("/apisis")
@RestController
public class Usu_rolController {
	@Autowired
	private Usu_rolService usu_rolService;
	@GetMapping("/usu_rol")
	public List<Usu_rol>readAll(){
		return (List<Usu_rol>) usu_rolService.findAll();
	}
	@GetMapping("usu_rol/{idusu_rol}")
	public Usu_rol read (@PathVariable Long idusu_rol) {
		return usu_rolService.findById(idusu_rol);
		
	}
	@PostMapping("/usu_rol")
	@ResponseStatus(HttpStatus.CREATED)
	public Usu_rol create (@RequestBody Usu_rol usu_rol) {
		return usu_rolService.save(usu_rol);
		
	}
	@PutMapping("/editar/{idusu_rol}")
	public Usu_rol update(@RequestBody Usu_rol usu_rol, @PathVariable Long idusu_rol) {
		Usu_rol editar_usu_rol = usu_rolService.findById(idusu_rol);

		editar_usu_rol.setIdusuario(usu_rol.getIdusuario());
		editar_usu_rol.setIdrol(usu_rol.getIdrol());
		editar_usu_rol.setFecha(usu_rol.getFecha());
		editar_usu_rol.setEstado(usu_rol.getEstado());

		
		
		return usu_rolService.save(editar_usu_rol);
		
	}
	@DeleteMapping("eliminarusu_rol/{idusu_rol}")
	public void delete(@PathVariable Long idusu_rol) {
		usu_rolService.delete(idusu_rol);
	  
        System.out.print("Usuario Rol Borrado");
	}

}