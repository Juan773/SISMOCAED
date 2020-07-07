package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.OpcionDao;

import com.upeu.edu.pe.sismocaed.entity.Opcion;

import com.upeu.edu.pe.sismocaed.service.OpcionService;
@Service
public class OpcionServiceImpl implements OpcionService {

	

	@Autowired
	private OpcionDao opcionDao;
	@Override
	@Transactional(readOnly = true)
	public List<Opcion> findAll() {
		// TODO Auto-generated method stub
		return (List<Opcion>) opcionDao.findAll();
	}

	@Override
	public Opcion findById(Long idopcion) {
		// TODO Auto-generated method stub
		return opcionDao.findById(idopcion).orElse(null);
	}

	@Override
	public Opcion save(Opcion opcion) {
		// TODO Auto-generated method stub
		return opcionDao.save(opcion);
	}

	@Override
	public void delete(Long idopcion) {
		// TODO Auto-generated method stub
		opcionDao.deleteById(idopcion);

	}

}
