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
@Table(name="aprobacion")
public class Aprobacion implements Serializable{

	private static final long serialVersionUID = -6586368128144516008L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idaprobacion;
	@Column(length=45)
	public String codigo;
	@Column(length=45)
	public Date fecha;
	@Column(length=45)
	public String doc_apro;
	@ManyToOne
	@JoinColumn(name="idconvocatoria")
	Convocatoria idconvocatoria;
	public Aprobacion() {
		super();
	}
	public Aprobacion(Long idaprobacion, String codigo, Date fecha, String doc_apro, Convocatoria idconvocatoria) {
		super();
		this.idaprobacion = idaprobacion;
		this.codigo = codigo;
		this.fecha = fecha;
		this.doc_apro = doc_apro;
		this.idconvocatoria = idconvocatoria;
	}
	public Long getIdaprobacion() {
		return idaprobacion;
	}
	public void setIdaprobacion(Long idaprobacion) {
		this.idaprobacion = idaprobacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDoc_apro() {
		return doc_apro;
	}
	public void setDoc_apro(String doc_apro) {
		this.doc_apro = doc_apro;
	}
	public Convocatoria getIdconvocatoria() {
		return idconvocatoria;
	}
	public void setIdconvocatoria(Convocatoria idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}
	
	

}
