package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;

public interface Requisitos_aService {

	public List<Requisitos_a> findAll();
	public Requisitos_a findById(Long idrequisitos_a);
	public Requisitos_a save(Requisitos_a requisitos_a);
	public void delete(Long idrequisitos_a);
	public List<Requisitos_a> getReq_aProcedure();
	public Requisitos_a storeFile(MultipartFile file, Requisitos_a requisitos_a);
	public Requisitos_a getFile(Long idrequisitos_a);
	public List<Requisitos_a> getFormato012();
	List<Requisitos_a> listprocedure();
}
