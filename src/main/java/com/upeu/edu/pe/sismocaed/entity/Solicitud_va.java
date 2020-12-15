package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="solicitud")
public class Solicitud_va implements Serializable{
    private static final long serialVersionUID = 7633281128077521437L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long idsolicitud;
    @Column(length=45)
    public String solicitud_mad;
    @Column(length=45)
    public String carta_m;
    @Column(length=45)
    public String cv;
	public String imagen;
	public String nombre;
	
  
    
    
	public Solicitud_va(Long idsolicitud, String solicitud_mad, String carta_m, String cv,String imagen,String nombre) {
		super();
		this.idsolicitud = idsolicitud;
		this.solicitud_mad = solicitud_mad;
		this.carta_m = carta_m;
		this.cv = cv;
		this.imagen = imagen;
		this.nombre = nombre;
	
	}

	public Solicitud_va() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(Long idsolicitud) {
		this.idsolicitud = idsolicitud;
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



	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}