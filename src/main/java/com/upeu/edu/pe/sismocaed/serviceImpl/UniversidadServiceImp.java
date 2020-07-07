package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.UniversidadDao;
import com.upeu.edu.pe.sismocaed.entity.Universidad;
import com.upeu.edu.pe.sismocaed.service.UniversidadService;

@Service
public class UniversidadServiceImp implements UniversidadService{

	@Autowired
	private UniversidadDao universidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Universidad> findAll() {
		// TODO Auto-generated method stub
		return (List<Universidad>) universidadDao.findAll();
	}

	@Override
	public Universidad findById(Long iduniversidad) {
		// TODO Auto-generated method stub
		return universidadDao.findById(iduniversidad).orElse(null);
	}

	@Override
	public Universidad save(Universidad universidad) {
		// TODO Auto-generated method stub
		return universidadDao.save(universidad);
	}

	@Override
	public void delete(Long iduniversidad) {
		// TODO Auto-generated method stub
		universidadDao.deleteById(iduniversidad);
		
	}
	
}
