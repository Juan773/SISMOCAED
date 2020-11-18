package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.upeu.edu.pe.sismocaed.entity.Vacantes;

public interface VacantesService {
	
	public List<Vacantes> findAll();
	public Vacantes findById(Long idvacante);
	public void delete(Long idvacante);
	String guardar(@Valid Vacantes vacantes, BindingResult result, Model model, MultipartFile imagen,
			RedirectAttributes attribute);
}
