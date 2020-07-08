package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="postulante")
public class Postulante implements Serializable{

      private static final long serialVersionUID = 7633281128077521437L;

      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      public Long idpostulante;
      @Column(length=45)
      public String escuela_p;
      @Column(length=45)
      public String profesion;
      @Column(length=45)
      public String grado;
      @Column(length=45)
      public String estado;
      @ManyToOne
      @JoinColumn(name="idpersona")
      Persona idpersona;
	public Postulante() {
		super();
	}
	public Postulante(Long idpostulante, String escuela_p, String profesion, String grado, String estado,
			Persona idpersona) {
		super();
		this.idpostulante = idpostulante;
		this.escuela_p = escuela_p;
		this.profesion = profesion;
		this.grado = grado;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	public Long getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Long idpostulante) {
		this.idpostulante = idpostulante;
	}
	public String getEscuela_p() {
		return escuela_p;
	}
	public void setEscuela_p(String escuela_p) {
		this.escuela_p = escuela_p;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Persona getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}
      
      
}
