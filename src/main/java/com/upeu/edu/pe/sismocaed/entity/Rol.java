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
@Entity
@Table(name="rol")
public class Rol implements Serializable{


	private static final long serialVersionUID = 8275781841983137502L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrol;
	private String nombre;
	private String estado;

	   @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  	@JoinTable(name="op_rol", joinColumns= @JoinColumn(name="idrol"),
	  	inverseJoinColumns=@JoinColumn(name="idopcion"))
	      private List<Opcion> opcion;

	public Long getIdrol() {
		return idrol;
	}

	public void setIdrol(Long idrol) {
		this.idrol = idrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Opcion> getOpcion() {
		return opcion;
	}

	public void setOpcion(List<Opcion> opcion) {
		this.opcion = opcion;
	}


    
}
