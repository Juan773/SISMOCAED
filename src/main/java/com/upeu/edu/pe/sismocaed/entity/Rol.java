package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rol")
public class Rol implements Serializable{

	
	private static final long serialVersionUID = 7320701476937204392L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrol;
	@Column(length = 45)
	private String nombre;
	
    public Rol() {
		super();
	}

	public Rol(int idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
