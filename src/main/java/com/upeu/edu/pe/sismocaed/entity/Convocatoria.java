package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="convocatoria")

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="convo_probyid", procedureName = "listconv_byid",
	                           parameters= {@StoredProcedureParameter(mode = ParameterMode.IN,
	                           name = "p_idconvocatoria", type = Long.class)})
})

public class Convocatoria implements Serializable{

	private static final long serialVersionUID = 203527103058157394L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idconvocatoria;
	@Column(length=45)
	public String nombre_con;
	@Column(length=45)
	public String fecha_ini;
	@Column(length=45)
	public String fecha_fin;
	@Column(length=45)
	public String descripcion;
	@Column(length=45)
	public String imagen;

	@ManyToOne
	@JoinColumn(name="idpublicidad")
	Publicidad idpublicidad;

	public Convocatoria(Long idconvocatoria, String nombre_con, String fecha_ini, String fecha_fin, String descripcion,
			String imagen, Publicidad idpublicidad) {
		super();
		this.idconvocatoria = idconvocatoria;
		this.nombre_con = nombre_con;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.idpublicidad = idpublicidad;
	}

	public Long getIdconvocatoria() {
		return idconvocatoria;
	}

	public void setIdconvocatoria(Long idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}

	public String getNombre_con() {
		return nombre_con;
	}

	public void setNombre_con(String nombre_con) {
		this.nombre_con = nombre_con;
	}

	public String getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Publicidad getIdpublicidad() {
		return idpublicidad;
	}

	public void setIdpublicidad(Publicidad idpublicidad) {
		this.idpublicidad = idpublicidad;
	}
	
	//@OneToMany(mappedBy = "convocatoria")
   // private Detalle_convo detalle_convo;
	
	
	
}
