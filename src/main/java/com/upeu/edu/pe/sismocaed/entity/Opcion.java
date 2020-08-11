package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.upeu.edu.pe.sismocaed.security.entity.Usuario;

@Entity
@Table(name="opcion")
public class Opcion implements Serializable{
 
 
	private static final long serialVersionUID = -3170127030020972488L;
	  @Id
  	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long idopcion;
      private String opcion;
      private String descripcion;
      private String enlace;
      private String icono;
      private String tipo;
      private String orden;
      private String estado;
      
      @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  	@JoinTable(name="op_usu", joinColumns= @JoinColumn(name="idusuario"),
  	inverseJoinColumns=@JoinColumn(name="idopcion"))
      private List<Usuario> usuario;
      
   

	public Long getIdopcion() {
		return idopcion;
	}

	public void setIdopcion(Long idopcion) {
		this.idopcion = idopcion;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public Opcion() {
		super();
		// TODO Auto-generated constructor stub
	}





}
