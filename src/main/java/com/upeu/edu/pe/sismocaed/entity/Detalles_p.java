package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalles_p")
public class Detalles_p implements Serializable{

	private static final long serialVersionUID = -4892797756901972518L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long iddetalle_p;
    @Column(length=45)
    public String documento;
    @Column(length=45)
    public String detalle;
    @ManyToOne
    @JoinColumn(name="idpostulante")
    Postulante idpostulante;
	public Detalles_p() {
		super();
	}
	public Detalles_p(Long iddetalle_p, String documento, String detalle, Postulante idpostulante) {
		super();
		this.iddetalle_p = iddetalle_p;
		this.documento = documento;
		this.detalle = detalle;
		this.idpostulante = idpostulante;
	}
	public Long getIddetalle_p() {
		return iddetalle_p;
	}
	public void setIddetalle_p(Long iddetalle_p) {
		this.iddetalle_p = iddetalle_p;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Postulante getIdpostulante() {
		return idpostulante;
	}
	public void setIdpostulante(Postulante idpostulante) {
		this.idpostulante = idpostulante;
	}
    
    
}
