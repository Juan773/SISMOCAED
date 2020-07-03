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
}
