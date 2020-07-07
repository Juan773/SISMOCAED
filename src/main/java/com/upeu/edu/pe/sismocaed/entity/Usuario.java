package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 3207294112908391546L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuario;
	private String nom_user;
	private String pass_user;
	private String estado;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="idpersona")
	Persona idpersona;
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getPass_user() {
		return pass_user;
	}
	public void setPass_user(String pass_user) {
		this.pass_user = pass_user;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Persona getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 
}
