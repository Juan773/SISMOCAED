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
@Table(name = "usu_rol")
public class Usu_rol implements Serializable{

	private static final long serialVersionUID = -3091173058288081724L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusu_rol;
	@ManyToOne
	@JoinColumn(name="idusuario")
	Usuario idusuario;
	@ManyToOne
	@JoinColumn(name="idrol")
	Rol idrol;
	private Date fecha;
	private String estado;
	public Long getIdusu_rol() {
		return idusu_rol;
	}
	public void setIdusu_rol(Long idusu_rol) {
		this.idusu_rol = idusu_rol;
	}
	public Usuario getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}
	public Rol getIdrol() {
		return idrol;
	}
	public void setIdrol(Rol idrol) {
		this.idrol = idrol;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usu_rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
