package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="convicatoria")
public class Convocatoria implements Serializable{

	private static final long serialVersionUID = 203527103058157394L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idconvocatoria;
	@Column(length=45)
	public String nombre_con;
	@Column(length=45)
	public Date fecha_ini;
	@Column(length=45)
	public Date fecha_fin;
	@Column(length=45)
	public String descripcion;
	@Column(length=45)
	public String publicacion;
}
