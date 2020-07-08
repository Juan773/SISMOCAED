package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Apro_post;

public interface Apro_postService {

	public List<Apro_post> findAll();
	public Apro_post findById(Long idapro_post);
	public Apro_post save(Apro_post apro_post);
	public void delete(Long idapro_post);
}
