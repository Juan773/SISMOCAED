package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="apro_post")
public class Apro_post implements Serializable{

	private static final long serialVersionUID = -7580800726873532246L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idapro_post;
	@Column(length=45)
	public Date fecha;
	@ManyToOne
	@JoinColumn(name="idaprobacion")
	Aprobacion idaprobacion;
	@ManyToOne
	@JoinColumn(name="idpostulante")
	Postulante idpostulante;
	public Apro_post() {
		super();
	}
	public Apro_post(Long idapro_post, Date fecha, Aprobacion idaprobacion, Postulante idpostulante) {
		super();
		this.idapro_post = idapro_post;
		this.fecha = fecha;
		this.idaprobacion = idaprobacion;
		this.idpostulante = idpostulante;
	}
	public Long getIdapro_post() {
		return idapro_post;
	}
	public void setIdapro_post(Long idapro_post) {
		this.idapro_post = idapro_post;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Aprobacion getIdaprobacion() {
		return idaprobacion;
	}
	public void setIdaprobacion(Aprobacion idaprobacion) {
		this.idaprobacion = idaprobacion;
	}
	public Postulante getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Postulante idpostulante) {
		this.idpostulante = idpostulante;
	}
	
	
	
}
