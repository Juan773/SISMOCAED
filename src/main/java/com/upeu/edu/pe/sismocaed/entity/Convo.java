package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "convo")
public class Convo implements Serializable{

	private static final long serialVersionUID = 3699756193754013224L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idconvocatoria;

	public String nombre_con;
	public String fecha_ini;
	public String fecha_fin;
	public String descripcion;
	public String imagen;
	
	
	
	
	
	
	
	
	public Convo(Long idconvocatoria, String nombre_con, String fecha_ini, String fecha_fin, String descripcion,
			String imagen) {
		super();
		this.idconvocatoria = idconvocatoria;
		this.nombre_con = nombre_con;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}
	public Long getIdconvocatoria() {
		return idconvocatoria;
	}
	public void setIdconvocatoria(Long idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}
	public String getNombre_con() {
		return nombre_con;
	}
	public void setNombre_con(String nombre_con) {
		this.nombre_con = nombre_con;
	}
	public String getFecha_ini() {
		return fecha_ini;
	}
	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Convo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
