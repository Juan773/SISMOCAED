package com.upeu.edu.pe.sismocaed.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.edu.pe.sismocaed.security.entity.Usuario;
import com.upeu.edu.pe.sismocaed.security.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
		return usuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return usuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombre(String nombre) {
		return usuarioRepository.existsByNombre(nombre);
	}
	
	public void save(Usuario usuario) {
	    usuarioRepository.save(usuario);
	}
}
