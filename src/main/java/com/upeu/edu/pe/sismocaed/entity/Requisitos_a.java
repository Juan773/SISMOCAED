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
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name="requisitos_a")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="list_procedure" , procedureName="list_req"),
	@NamedStoredProcedureQuery(name= "list_formato012", procedureName = "Formato_F102")
})
public class Requisitos_a implements Serializable{

	private static final long serialVersionUID = -6355454216883554473L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long idrequisito;
	@Column(length=45)
	public String descripcion;
	@Column(length=45)
	public String archivo;
	@Column(length=45)
	public String documentos;
	@ManyToOne
	@JoinColumn(name="ide_profesional")
	E_Profesional ide_profesional;
	@Lob
	  @Column(name = "pic")
	  private byte[] pic;
	public Requisitos_a() {
		super();
	}
	public Requisitos_a(Long idrequisito, String descripcion, String archivo, String documentos,
			E_Profesional ide_profesional, byte[] pic) {
		super();
		this.idrequisito = idrequisito;
		this.descripcion = descripcion;
		this.archivo = archivo;
		this.documentos = documentos;
		this.ide_profesional = ide_profesional;
		this.pic = pic;
	}
	public Long getIdrequisito() {
		return idrequisito;
	}
	public void setIdrequisito(Long idrequisito) {
		this.idrequisito = idrequisito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public String getDocumentos() {
		return documentos;
	}
	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}
	public E_Profesional getIde_profesional() {
		return ide_profesional;
	}
	public void setIde_profesional(E_Profesional ide_profesional) {
		this.ide_profesional = ide_profesional;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	
	
}
