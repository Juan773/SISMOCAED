package com.upeu.edu.pe.sismocaed.security.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.upeu.edu.pe.sismocaed.security.enums.RolNombre;

@Entity
@Table(name = "rol")
public class Rol implements Serializable{

	
	private static final long serialVersionUID = 7320701476937204392L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrol;
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;
	
	public Rol() {
		super();
	}
	public Rol(RolNombre rolNombre) {
		super();
		this.rolNombre = rolNombre;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public RolNombre getRolNombre() {
		return rolNombre;
	}
	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
	
	
}
