package com.upeu.edu.pe.sismocaed.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.upeu.edu.pe.sismocaed.security.entity.Usuario;
import com.upeu.edu.pe.sismocaed.security.entity.UsuarioPrincipal;

@Service
public class UserDetailServiceImp implements UserDetailsService{
	/*Convierte el usuario en un Usuario principal*/
	@Autowired
    UsuarioService usuarioService;
	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
		return UsuarioPrincipal.build(usuario);
	}

}
