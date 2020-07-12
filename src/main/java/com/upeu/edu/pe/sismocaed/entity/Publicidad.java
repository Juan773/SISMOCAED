package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="publicidad")
public class Publicidad implements Serializable {


	private static final long serialVersionUID = -654926197265551465L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idpublicidad;
	public String titulo;
	public String url_imagen;
	public String estado;
	public Publicidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publicidad(Long idpublicidad, String titulo, String url_imagen, String estado) {
		super();
		this.idpublicidad = idpublicidad;
		this.titulo = titulo;
		this.url_imagen = url_imagen;
		this.estado = estado;
	}
	public Long getIdpublicidad() {
		return idpublicidad;
	}
	public void setIdpublicidad(Long idpublicidad) {
		this.idpublicidad = idpublicidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUrl_imagen() {
		return url_imagen;
	}
	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
