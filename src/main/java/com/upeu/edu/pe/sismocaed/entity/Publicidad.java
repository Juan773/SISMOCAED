package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
@Entity
@Table(name="publicidad")
public class Publicidad implements Serializable {


	private static final long serialVersionUID = -654926197265551465L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonView(View.FileInfo.class)
	public Long idpublicidad;
	@JsonView(View.FileInfo.class)
	public String titulo;
	public String url_imagen;
	public String estado;
	@Lob
	  @Column(name = "pic")
	  private byte[] pic;
	public Publicidad() {
		super();
	}
	public Publicidad(Long idpublicidad, String titulo, String url_imagen, String estado, byte[] pic) {
		super();
		this.idpublicidad = idpublicidad;
		this.titulo = titulo;
		this.url_imagen = url_imagen;
		this.estado = estado;
		this.pic = pic;
	}
	public Long getIdpublicidad() {
		return idpublicidad;
	}
	public void setIdpublicidad(Long idpublicidad) {
		this.idpublicidad = idpublicidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUrl_imagen() {
		return url_imagen;
	}
	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	

    	

}
