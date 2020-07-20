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
    private String imagenId;
	public String estado;
	@Lob
	  @Column(name = "pic")
	  private byte[] pic;
	public Publicidad() {
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
	}
	public Publicidad(String titulo, String url_imagen, String imagenId, String estado) {
=======
		super();
	}
	public Publicidad(Long idpublicidad, String titulo, String url_imagen, String estado, byte[] pic) {
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
		super();
		this.titulo = titulo;
		this.url_imagen = url_imagen;
		this.imagenId = imagenId;
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
	public String getImagenId() {
		return imagenId;
	}
	public void setImagenId(String imagenId) {
		this.imagenId = imagenId;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
<<<<<<< HEAD
	
=======
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	

    	

>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
}
