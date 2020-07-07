package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Table;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "trabajador")

public class Trabajador implements Serializable {

	private static final long serialVersionUID = -4616603435412287892L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtrabajador;
	private String cargo;
	private String profesion;
	@ManyToOne
	@JoinColumn(name="idpersona")
	Persona idpersona;
	public Long getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(Long idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public Persona getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
