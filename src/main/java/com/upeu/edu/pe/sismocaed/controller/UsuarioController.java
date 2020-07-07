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

import com.upeu.edu.pe.sismocaed.entity.Usuario;
import com.upeu.edu.pe.sismocaed.service.UsuarioService;
@RequestMapping("/apisis")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping("/usuario")
	public List<Usuario>readAll(){
		return (List<Usuario>) usuarioService.findAll();
	}
	@GetMapping("usuario/{idusuario}")
	public Usuario read (@PathVariable Long idusuario) {
		return usuarioService.findById(idusuario);
		
	}
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create (@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
		
	}
	@PutMapping("/editar/{idusuario}")
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long idusuario) {
		Usuario editar_usuario = usuarioService.findById(idusuario);

		editar_usuario.setNom_user(usuario.getNom_user());
		editar_usuario.setPass_user(usuario.getPass_user());
		editar_usuario.setEstado(usuario.getEstado());
		editar_usuario.setFecha(usuario.getFecha());
		editar_usuario.setIdpersona(usuario.getIdpersona());
		
		return usuarioService.save(editar_usuario);
		
	}
	@DeleteMapping("eliminarusuario/{idusuario}")
	public void delete(@PathVariable Long idusuario) {
		usuarioService.delete(idusuario);
	  
        System.out.print("Usuario Borrado");
	}

}
