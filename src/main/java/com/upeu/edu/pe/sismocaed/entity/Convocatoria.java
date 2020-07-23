package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="convocatoria")
public class Convocatoria implements Serializable{

	private static final long serialVersionUID = 203527103058157394L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idconvocatoria;
	@Column(length=45)
	public String nombre_con;
	@Column(length=45)
	public Date fecha_ini;
	@Column(length=45)
	public Date fecha_fin;
	@Column(length=45)
	public String descripcion;

	@ManyToOne
	@JoinColumn(name="idpublicidad")
	Publicidad idpublicidad;
	public Convocatoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Convocatoria(Long idconvocatoria, String nombre_con, Date fecha_ini, Date fecha_fin, String descripcion,
	 Publicidad idpublicidad) {
		super();
		this.idconvocatoria = idconvocatoria;
		this.nombre_con = nombre_con;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.descripcion = descripcion;
		this.idpublicidad = idpublicidad;
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
	public Date getFecha_ini() {
		return fecha_ini;
	}
	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Publicidad getIdpublicidad() {
		return idpublicidad;
	}
	public void setIdpublicidad(Publicidad idpublicidad) {
		this.idpublicidad = idpublicidad;
	}	
}
