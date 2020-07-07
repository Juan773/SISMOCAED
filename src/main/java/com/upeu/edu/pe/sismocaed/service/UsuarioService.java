package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Usuario;

public interface UsuarioService {
	   public List<Usuario>findAll();
	   public Usuario findById(Long idusuario);
	   public Usuario save(Usuario usuario);
	   public void delete (Long idusuario);
}
