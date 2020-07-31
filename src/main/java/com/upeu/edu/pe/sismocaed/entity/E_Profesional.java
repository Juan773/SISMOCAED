package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="e_profesional")
public class E_Profesional implements Serializable{

	private static final long serialVersionUID = 3008332732709981416L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long ide_profesional;
	@Column(length=45)
	public String nombre;
	@Column(length=45)
	public String facultad;
	@Column(length=45)
	public String vacantes;
	@Column(length = 45)
	public String contacto;
	@Column(length = 45)
	public String fecha_pre;
	@ManyToOne
	@JoinColumn(name="iduniversidad") 
	Universidad iduniversidad;
	public E_Profesional() {
		super();
	}
	public E_Profesional(Long ide_profesional, String nombre, String facultad, String vacantes, String contacto,
			String fecha_pre, Universidad iduniversidad) {
		super();
		this.ide_profesional = ide_profesional;
		this.nombre = nombre;
		this.facultad = facultad;
		this.vacantes = vacantes;
		this.contacto = contacto;
		this.fecha_pre = fecha_pre;
		this.iduniversidad = iduniversidad;
	}
	public Long getIde_profesional() {
		return ide_profesional;
	}
	public void setIde_profesional(Long ide_profesional) {
		this.ide_profesional = ide_profesional;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getVacantes() {
		return vacantes;
	}
	public void setVacantes(String vacantes) {
		this.vacantes = vacantes;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getFecha_pre() {
		return fecha_pre;
	}
	public void setFecha_pre(String fecha_pre) {
		this.fecha_pre = fecha_pre;
	}
	public Universidad getIduniversidad() {
		return iduniversidad;
	}
	public void setIduniversidad(Universidad iduniversidad) {
		this.iduniversidad = iduniversidad;
	}
	
	
	
}
