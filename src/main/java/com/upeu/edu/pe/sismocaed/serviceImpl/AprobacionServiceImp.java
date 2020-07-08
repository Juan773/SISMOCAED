package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.AprobacionDao;
import com.upeu.edu.pe.sismocaed.entity.Aprobacion;
import com.upeu.edu.pe.sismocaed.service.AprobacionService;

@Service
public class AprobacionServiceImp implements AprobacionService{
	@Autowired
	public AprobacionDao aprobacionDao;

	@Override
	@Transactional(readOnly = true)
	public List<Aprobacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Aprobacion>) aprobacionDao.findAll();
	}

	@Override
	public Aprobacion findById(Long idaprobacion) {
		// TODO Auto-generated method stub
		return aprobacionDao.findById(idaprobacion).orElse(null);
	}

	@Override
	public Aprobacion save(Aprobacion aprobacion) {
		// TODO Auto-generated method stub
		return aprobacionDao.save(aprobacion);
	}

	@Override
	public void delete(Long idaaprobacion) {
		// TODO Auto-generated method stub
		aprobacionDao.deleteById(idaaprobacion);
	}

}
