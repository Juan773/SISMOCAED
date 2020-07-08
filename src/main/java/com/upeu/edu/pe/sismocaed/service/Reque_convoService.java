package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Reque_convo;

public interface Reque_convoService {

	public List<Reque_convo> findAll();
	public Reque_convo findById(Long idreque_convo);
	public Reque_convo save(Reque_convo reque_convo);
	public void delete(Long idreque_convo);
}
