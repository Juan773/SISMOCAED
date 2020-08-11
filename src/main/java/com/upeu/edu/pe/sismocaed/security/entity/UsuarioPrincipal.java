package com.upeu.edu.pe.sismocaed.security.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails{

	
	private static final long serialVersionUID = -8438235244706303074L;
	
	private String nombre;
	private String nombreUsuario;
	private String pasword;
	private Collection<? extends GrantedAuthority> authorities;  //obtiene las autoridades
	
	public UsuarioPrincipal() {
		super();
	}
	
	
	public UsuarioPrincipal(String nombre, String nombreUsuario, String pasword,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.pasword = pasword;
		this.authorities = authorities;
	}
	
	/*Convierto la clase rol en GrantedAuthority*/
	public static UsuarioPrincipal build(Usuario usuario) {
		List<GrantedAuthority> authorities = 
				usuario.getRoles().stream().map( rol -> new SimpleGrantedAuthority(rol
						.getRolNombre().name())).collect(Collectors.toList());
	    return new 	UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getPassword(), authorities);
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pasword;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return nombreUsuario;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
