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
@Table(name="reque_convo")
public class Reque_convo implements Serializable{

	private static final long serialVersionUID = -7123246627818499108L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long idreque_conv;
	@Column(length=10)
	public String estado;
	@ManyToOne
	@JoinColumn(name="idrequisito")
	Requisitos_a idrequisito;
	@ManyToOne
	@JoinColumn(name="idconvocatoria")
	Convocatoria idconvocatoria;
	public Reque_convo() {
		super();
	}
	public Reque_convo(Long idreque_conv, String estado, Requisitos_a idrequisito, Convocatoria idconvocatoria) {
		super();
		this.idreque_conv = idreque_conv;
		this.estado = estado;
		this.idrequisito = idrequisito;
		this.idconvocatoria = idconvocatoria;
	}
	public Long getIdreque_conv() {
		return idreque_conv;
	}
	public void setIdreque_conv(Long idreque_conv) {
		this.idreque_conv = idreque_conv;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Requisitos_a getIdrequisito() {
		return idrequisito;
	}
	public void setIdrequisito(Requisitos_a idrequisito) {
		this.idrequisito = idrequisito;
	}
	public Convocatoria getIdconvocatoria() {
		return idconvocatoria;
	}
	public void setIdconvocatoria(Convocatoria idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}
	
	
}
