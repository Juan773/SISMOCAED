package com.upeu.edu.pe.sismocaed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.upeu.edu.pe.sismocaed.dao.RolDao;
import com.upeu.edu.pe.sismocaed.dao.UsuarioDao;
import com.upeu.edu.pe.sismocaed.entity.Usuario;

@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson gson = new Gson();
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private RolDao rolDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.validarUsuario(nombreUsuario);
		UserDetails details = new User(usuario.getNombreUsuario(), usuario.getPassword(), rolDao.buscarRolUser(usuario.getIdusuario()));
		return details;
	}

}
