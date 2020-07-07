package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="persona")
public class Persona implements Serializable{

	private static final long serialVersionUID = 8326493188953673321L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idersona;
	@Column(length = 50)
	private String nombre;
	private String apellido;
	private String celular;
	private String dni;
	private String direccion;
	private String correo;
	private Date fecha_n;
	
	public Persona(Long idersona, String nombre, String apellido, String celular, String dni, String direccion,
			String correo, Date fecha_n) {
		super();
		this.idersona = idersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.dni = dni;
		this.direccion = direccion;
		this.correo = correo;
		this.fecha_n = fecha_n;
	}
	public Long getIdpersona() {
		return idersona;
	}
	public void setIdPersona(Long idersona) {
		this.idersona = idersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getFecha_n() {
		return fecha_n;
	}
	public void setFecha_n(Date fecha_n) {
		this.fecha_n = fecha_n;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
