package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notificaciones")
public class Notificaciones implements Serializable{

	private static final long serialVersionUID = -6958842317433928021L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idnotificacion;
    @Column(length=45)
    public String titulo;
    @Column(length=45)
    public String descripcion;
    @Column(length=45)
    public Date fecha;
    @ManyToOne
    @JoinColumn(name="idpostulante")
    Postulante idpostulante;
	public Notificaciones() {
		super();
	}
	public Notificaciones(Long idnotificacion, String titulo, String descripcion, Date fecha, Postulante idpostulante) {
		super();
		this.idnotificacion = idnotificacion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.idpostulante = idpostulante;
	}
	public Long getIdnotificacion() {
		return idnotificacion;
	}
	public void setIdnotificacion(Long idnotificacion) {
		this.idnotificacion = idnotificacion;
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
    
    
}
