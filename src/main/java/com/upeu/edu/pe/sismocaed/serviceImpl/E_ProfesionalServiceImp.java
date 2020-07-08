package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.E_ProfesionalDao;
import com.upeu.edu.pe.sismocaed.entity.E_Profesional;
import com.upeu.edu.pe.sismocaed.service.E_ProfesionalService;

@Service
public class E_ProfesionalServiceImp implements E_ProfesionalService{

	@Autowired
	private E_ProfesionalDao e_profesionalDao;

	@Override
	@Transactional(readOnly = true)
	public List<E_Profesional> findAll() {
		// TODO Auto-generated method stub
		return (List<E_Profesional>) e_profesionalDao.findAll();
	}

	@Override
	public E_Profesional findById(Long ide_profesional) {
		// TODO Auto-generated method stub
		return e_profesionalDao.findById(ide_profesional).orElse(null);
	}

	@Override
	public E_Profesional save(E_Profesional e_profesional) {
		// TODO Auto-generated method stub
		return e_profesionalDao.save(e_profesional);
	}

	@Override
	public void delete(Long ide_profesional) {
		// TODO Auto-generated method stub
		e_profesionalDao.deleteById(ide_profesional);
	}

}
