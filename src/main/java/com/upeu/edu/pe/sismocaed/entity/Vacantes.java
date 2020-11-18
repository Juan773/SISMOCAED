package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vacantes")
public class Vacantes implements Serializable{

	private static final long serialVersionUID = -2142316243778940867L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long idvacante;
	@Column(length = 45)
	public String uni_anfi;
	@Column(length = 45)
	public String fecha_inicio;
	@Column(length = 45)
	public String fecha_fin;
	@Column(length = 45)
	public String contacto;
	@Column(length = 45)
	public String imagen;
	
	public Vacantes() {
		super();
	}

	public Vacantes(Long idvacante, String uni_anfi, String fecha_inicio, String fecha_fin, String contacto,
			String imagen) {
		super();
		this.idvacante = idvacante;
		this.uni_anfi = uni_anfi;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.contacto = contacto;
		this.imagen = imagen;
	}

	public Long getIdvacante() {
		return idvacante;
	}

	public void setIdvacante(Long idvacante) {
		this.idvacante = idvacante;
	}

	public String getUni_anfi() {
		return uni_anfi;
	}

	public void setUni_anfi(String uni_anfi) {
		this.uni_anfi = uni_anfi;
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

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
