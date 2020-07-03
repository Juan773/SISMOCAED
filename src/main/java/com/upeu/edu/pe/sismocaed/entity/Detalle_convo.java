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
@Table(name="detalle_convo")
public class Detalle_convo implements Serializable{

	private static final long serialVersionUID = -8377764425889229893L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long iddetalle_convo;
	@Column(length=45)
	public String formato_f012_f01;
	@Column(length=45)
	public String formato_f012_f02;
	@Column(length=45)
	public String curriculum;
	@ManyToOne
	@JoinColumn(name="idconvocatoria")
	Convocatoria idconvocatoria;
	@ManyToOne
	@JoinColumn(name="idpostulante")
	Postulante idpostulante;
	public Detalle_convo() {
		super();
	}
	public Detalle_convo(Long iddetalle_convo, String formato_f012_f01, String formato_f012_f02, String curriculum,
			Convocatoria idconvocatoria, Postulante idpostulante) {
		super();
		this.iddetalle_convo = iddetalle_convo;
		this.formato_f012_f01 = formato_f012_f01;
		this.formato_f012_f02 = formato_f012_f02;
		this.curriculum = curriculum;
		this.idconvocatoria = idconvocatoria;
		this.idpostulante = idpostulante;
	}
	public Long getIddetalle_convo() {
		return iddetalle_convo;
	}
	public void setIddetalle_convo(Long iddetalle_convo) {
		this.iddetalle_convo = iddetalle_convo;
	}
	public String getFormato_f012_f01() {
		return formato_f012_f01;
	}
	public void setFormato_f012_f01(String formato_f012_f01) {
		this.formato_f012_f01 = formato_f012_f01;
	}
	public String getFormato_f012_f02() {
		return formato_f012_f02;
	}
	public void setFormato_f012_f02(String formato_f012_f02) {
		this.formato_f012_f02 = formato_f012_f02;
	}
	public String getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}
	public Convocatoria getIdconvocatoria() {
		return idconvocatoria;
	}
	public void setIdconvocatoria(Convocatoria idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}
	public Postulante getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Postulante idpostulante) {
		this.idpostulante = idpostulante;
	}
	
	
}
