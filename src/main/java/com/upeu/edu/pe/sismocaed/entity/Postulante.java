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
@Table(name="postulante")
public class Postulante implements Serializable{

      private static final long serialVersionUID = 7633281128077521437L;

      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      public Long idpostulante;
      @Column(length=45)
      public Long codigo;
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
	public Postulante(Long idpostulante, Long codigo, String escuela_p, String profesion, String grado, String estado,
			Persona idpersona) {
		super();
		this.idpostulante = idpostulante;
		this.codigo = codigo;
		this.escuela_p = escuela_p;
		this.profesion = profesion;
		this.grado = grado;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	public Postulante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Long idpostulante) {
		this.idpostulante = idpostulante;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
