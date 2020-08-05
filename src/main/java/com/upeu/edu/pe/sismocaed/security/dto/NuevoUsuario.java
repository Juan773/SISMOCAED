package com.upeu.edu.pe.sismocaed.security.dto;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;

public class NuevoUsuario {
   
	@NotBlank
	private String nombre;
	@NotBlank
	private String nombreUsuario;
    @NotBlank
	private String password;
	private Set<String> roles = new HashSet<>();
	
	public NuevoUsuario() {
		super();
	}	
	
	public NuevoUsuario(@NotBlank String nombre, @NotBlank String nombreUsuario, @NotBlank String password,
			Set<String> roles) {
		super();
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.roles = roles;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
	
}
