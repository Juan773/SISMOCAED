package com.upeu.edu.pe.sismocaed.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="universidad")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="uni_procedure", procedureName="list_universidad"),
	@NamedStoredProcedureQuery(name="uni_probyid", procedureName = "listuni_byid",
	                           parameters= {@StoredProcedureParameter(mode = ParameterMode.IN,
	                           name = "p_iduniversidad", type = Long.class)})
})
public class Universidad implements Serializable{

	private static final long serialVersionUID = -4410426437930753861L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long iduniversidad;
	@Column(length=45)
	public String nombre;
	@Column(length=45)
	public String direccion;
	@Column(length=45)
	public String pais;
	@Column(length=45)
	public String totalvacantes;
	
	
	public Universidad() {
		super();
	}
	
	public Universidad(Long iduniversidad, String nombre, String direccion, String pais, String totalvacantes) {
		super();
		this.iduniversidad = iduniversidad;
		this.nombre = nombre;
		this.direccion = direccion;
		this.pais = pais;
		this.totalvacantes = totalvacantes;
	}

	public Long getIduniversidad() {
		return iduniversidad;
	}
	public void setIduniversidad(Long iduniversidad) {
		this.iduniversidad = iduniversidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTotalvacantes() {
		return totalvacantes;
	}
	public void setTotalvacantes(String totalvacantes) {
		this.totalvacantes = totalvacantes;
	}
	
	
	
}
