package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;

public interface Detalle_convoService {

	public List<Detalle_convo> findAll();
	public Detalle_convo findById(Long iddetalle_convo);
	public Detalle_convo save(Detalle_convo detalle_convo);
	public void delete(Long iddetalle_convo);
}
