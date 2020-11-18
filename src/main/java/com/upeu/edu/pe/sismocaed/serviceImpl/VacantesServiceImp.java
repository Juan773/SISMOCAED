package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.upeu.edu.pe.sismocaed.dao.VacantesDao;
import com.upeu.edu.pe.sismocaed.entity.Vacantes;
import com.upeu.edu.pe.sismocaed.service.VacantesService;

@Service
public class VacantesServiceImp implements VacantesService{
		
	@Autowired
	private VacantesDao vacantesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vacantes> findAll() {
		// TODO Auto-generated method stub
		return (List<Vacantes>) vacantesDao.findAll();
	}

	@Override
	public Vacantes findById(Long idvacante) {
		// TODO Auto-generated method stub
		return vacantesDao.findById(idvacante).orElse(null);
	}

	@Override
	public void delete(Long idvacante) {
		// TODO Auto-generated method stub
		vacantesDao.deleteById(idvacante);
	}

	@Override
	public String guardar(@Valid Vacantes vacantes, BindingResult result, Model model, MultipartFile imagen,
			RedirectAttributes attribute) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
