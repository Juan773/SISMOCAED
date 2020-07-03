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
@Table(name = "doc_aprobado")

public class Doc_aprobado implements Serializable  {

	private static final long serialVersionUID = -5258517687137333798L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idodc_aprobado;
    private String codigoap;
    private Date fecha;
    private String doc_curriculum_vitae;
    private String doc_certificado_salud;
    private String doc_antecedentes_policiales;
    private String doc_copia_pass;
    private String doc_copia_dni;
	@ManyToOne
	@JoinColumn(name="idtrabajador")
	Trabajador idtrabajador;
	@ManyToOne
	@JoinColumn(name="idpostulante")
	Postulante idpostulante;
	public Long getIdodc_aprobado() {
		return idodc_aprobado;
	}
	public void setIdodc_aprobado(Long idodc_aprobado) {
		this.idodc_aprobado = idodc_aprobado;
	}
	public String getCodigoap() {
		return codigoap;
	}
	public void setCodigoap(String codigoap) {
		this.codigoap = codigoap;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDoc_curriculum_vitae() {
		return doc_curriculum_vitae;
	}
	public void setDoc_curriculum_vitae(String doc_curriculum_vitae) {
		this.doc_curriculum_vitae = doc_curriculum_vitae;
	}
	public String getDoc_certificado_salud() {
		return doc_certificado_salud;
	}
	public void setDoc_certificado_salud(String doc_certificado_salud) {
		this.doc_certificado_salud = doc_certificado_salud;
	}
	public String getDoc_antecedentes_policiales() {
		return doc_antecedentes_policiales;
	}
	public void setDoc_antecedentes_policiales(String doc_antecedentes_policiales) {
		this.doc_antecedentes_policiales = doc_antecedentes_policiales;
	}
	public String getDoc_copia_pass() {
		return doc_copia_pass;
	}
	public void setDoc_copia_pass(String doc_copia_pass) {
		this.doc_copia_pass = doc_copia_pass;
	}
	public String getDoc_copia_dni() {
		return doc_copia_dni;
	}
	public void setDoc_copia_dni(String doc_copia_dni) {
		this.doc_copia_dni = doc_copia_dni;
	}
	public Trabajador getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(Trabajador idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public Postulante getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Postulante idpostulante) {
		this.idpostulante = idpostulante;
	}
    
    
}
