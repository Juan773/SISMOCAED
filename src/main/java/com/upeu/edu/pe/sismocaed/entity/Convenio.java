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
@Table(name="convenio")
public class Convenio implements Serializable{

	private static final long serialVersionUID = -5696135438539687815L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idconvenio;
	@Column(length=45)
	public String n_documento;
	@Column(length=45)
	public String fecha_inicio;
	@Column(length=45)
	public String fecha_fin;
	@ManyToOne
	@JoinColumn(name = "iduniversidad")
	Universidad iduniversidad;
	
	public Convenio() {
		super();
	}

	public Convenio(Long idconvenio, String n_documento, String fecha_inicio, String fecha_fin,
			Universidad iduniversidad) {
		super();
		this.idconvenio = idconvenio;
		this.n_documento = n_documento;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.iduniversidad = iduniversidad;
	}

	public Long getIdconvenio() {
		return idconvenio;
	}

	public void setIdconvenio(Long idconvenio) {
		this.idconvenio = idconvenio;
	}

	public String getN_documento() {
		return n_documento;
	}

	public void setN_documento(String n_documento) {
		this.n_documento = n_documento;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Universidad getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(Universidad iduniversidad) {
		this.iduniversidad = iduniversidad;
	}
	
}
