package com.upeu.edu.pe.sismocaed.entity;
import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "formulario_ma")
public class Formulario_ma implements Serializable{

	private static final long serialVersionUID = -3799556264479160166L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idformulario_ma;
	private String registro_macol;
	private String encargado_ep;
	private String seminario;
	private String investigacion;
	private String u_destino;
	private String semestre;
	private int terminos;
	@ManyToOne
	@JoinColumn(name="iddoc_aprobado")
	Doc_aprobado iddoc_aprobado;
	public Long getIdformulario_ma() {
		return idformulario_ma;
	}
	public void setIdformulario_ma(Long idformulario_ma) {
		this.idformulario_ma = idformulario_ma;
	}
	public String getRegistro_macol() {
		return registro_macol;
	}
	public void setRegistro_macol(String registro_macol) {
		this.registro_macol = registro_macol;
	}
	public String getEncargado_ep() {
		return encargado_ep;
	}
	public void setEncargado_ep(String encargado_ep) {
		this.encargado_ep = encargado_ep;
	}
	public String getSeminario() {
		return seminario;
	}
	public void setSeminario(String seminario) {
		this.seminario = seminario;
	}
	public String getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(String investigacion) {
		this.investigacion = investigacion;
	}
	public String getU_destino() {
		return u_destino;
	}
	public void setU_destino(String u_destino) {
		this.u_destino = u_destino;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getTerminos() {
		return terminos;
	}
	public void setTerminos(int terminos) {
		this.terminos = terminos;
	}
	public Doc_aprobado getiddoc_aprobado() {
		return iddoc_aprobado;
	}
	public void setiddoc_aprobado(Doc_aprobado iddoc_aprobado) {
		this.iddoc_aprobado = iddoc_aprobado;
	}
	public Formulario_ma() {
		super();
		// TODO Auto-generated constructor stub
	}


}
