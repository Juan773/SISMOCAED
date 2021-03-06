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
@Table(name = "informe_ma")
public class Informe_ma implements Serializable{

	private static final long serialVersionUID = -4281167407309705840L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idinforme_ma;
	private String titulo;
	private String descripcion;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="idpostulante")
	Postulante idpostulante;
	public Long getIdiforme_ma() {
		return idinforme_ma;
	}
	public void setInforme_ma(Long idinforme_ma) {
		this.idinforme_ma = idinforme_ma;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Postulante getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Postulante idpostulante) {
		this.idpostulante = idpostulante;
	}
	public Informe_ma() {
		super();
		// TODO Auto-generated constructor stub
	}
 
}
