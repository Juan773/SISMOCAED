package com.upeu.edu.pe.sismocaed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.upeu.edu.pe.sismocaed.dao.RolDao;
import com.upeu.edu.pe.sismocaed.dao.UsuarioDao;
import com.upeu.edu.pe.sismocaed.entity.Usuario;

@Service("userService")
public class UsuarioService implements UserDetailsService{
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	Gson gson = new Gson();
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private RolDao rolDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		if(usuario == null) {
			//Logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema!");
			System.out.println("Error en el login: no existe el usuario '"+ username+ "' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+username+"' en el sistema!");
		}
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
		/*UserDetails details = new User(usuario.getNombreUsuario(), usuario.getPassword(), rolDao.buscarRolUser(usuario.getNombreUsuario()));
		return details;*/
	}

}
