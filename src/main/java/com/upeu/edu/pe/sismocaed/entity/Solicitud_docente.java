package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solicitud_docente")
public class Solicitud_docente implements Serializable{


	private static final long serialVersionUID = -3453712231937795249L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long idsol_doc;
	public String nombre;
	public String solicitud_mad;
	public String carta_m;
	public String cv;
	public String imagen;
	
	
	
	
	public Solicitud_docente(Long idsol_doc, String solicitud_mad, String carta_m, String cv,String imagen,String nombre) {
		super();
		this.idsol_doc = idsol_doc;
		this.solicitud_mad = solicitud_mad;
		this.carta_m = carta_m;
		this.cv = cv;
		this.nombre = nombre;
		this.imagen = imagen;
	}
	public Solicitud_docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdsol_doc() {
		return idsol_doc;
	}
	public void setIdsol_doc(Long idsol_doc) {
		this.idsol_doc = idsol_doc;
	}
	public String getSolicitud_mad() {
		return solicitud_mad;
	}
	public void setSolicitud_mad(String solicitud_mad) {
		this.solicitud_mad = solicitud_mad;
	}
	public String getCarta_m() {
		return carta_m;
	}
	public void setCarta_m(String carta_m) {
		this.carta_m = carta_m;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
