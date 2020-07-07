package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Formulario_maDao;

import com.upeu.edu.pe.sismocaed.entity.Formulario_ma;

import com.upeu.edu.pe.sismocaed.service.Formulario_maService;
@Service
public class Formulario_maServiceImpl implements Formulario_maService{

	
	@Autowired
	private Formulario_maDao formulario_maDao;
	
	@Override
	@Transactional(readOnly = true)

	public List<Formulario_ma> findAll() {
		// TODO Auto-generated method stub
		return (List<Formulario_ma>) formulario_maDao.findAll();	}

	@Override
	public Formulario_ma findById(Long idformulario_maDao) {
		// TODO Auto-generated method stub
		return formulario_maDao.findById(idformulario_maDao).orElse(null);
	}

	@Override
	public Formulario_ma save(Formulario_ma formulario_ma) {
		// TODO Auto-generated method stub
		return formulario_maDao.save(formulario_ma);
	}	

	@Override
	public void delete(Long idformulario_ma) {
		// TODO Auto-generated method stub
		formulario_maDao.deleteById(idformulario_ma);
	}


}
