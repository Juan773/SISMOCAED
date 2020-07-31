package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="detalle_convo")
public class Detalle_convo implements Serializable{

	private static final long serialVersionUID = -8377764425889229893L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	public Long iddetalle_convo;
	@Column(length=45)
	public String url_solicitud;
	@Column(length=45)
	public String fecha;
	@Column(length=45)
	public String url_carta;
	@Column(length=45)
	public String url_curriculum;
	@Column(length=45)
	public String descripcion;
	@ManyToOne
	@JoinColumn(name="idconvocatoria")
	Convocatoria idconvocatoria;
	@ManyToOne
	@JoinColumn(name="idpostulante")
	Postulante idpostulante;
	
	@Lob
    private byte[] data;
	
	public Detalle_convo() {
		super();
	}
	public Detalle_convo(Long iddetalle_convo, String url_solicitud, String fecha, String url_carta,
			String url_curriculum, String descripcion, Convocatoria idconvocatoria, Postulante idpostulante,byte[] data) {
		super();
		this.iddetalle_convo = iddetalle_convo;
		this.url_solicitud = url_solicitud;
		this.fecha = fecha;
		this.url_carta = url_carta;
		this.url_curriculum = url_curriculum;
		this.descripcion = descripcion;
		this.idconvocatoria = idconvocatoria;
		this.idpostulante = idpostulante;
		this.data = data;
	}
	public Long getIddetalle_convo() {
		return iddetalle_convo;
	}
	public void setIddetalle_convo(Long iddetalle_convo) {
		this.iddetalle_convo = iddetalle_convo;
	}
	public String getUrl_solicitud() {
		return url_solicitud;
	}
	public void setUrl_solicitud(String url_solicitud) {
		this.url_solicitud = url_solicitud;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getUrl_carta() {
		return url_carta;
	}
	public void setUrl_carta(String url_carta) {
		this.url_carta = url_carta;
	}
	public String getUrl_curriculum() {
		return url_curriculum;
	}
	public void setUrl_curriculum(String url_curriculum) {
		this.url_curriculum = url_curriculum;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	  public byte[] getData() {
		    return data;
  }

    public void setData(byte[] data) {
		    this.data = data;
  }
	
}
