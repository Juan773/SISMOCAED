package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.edu.pe.sismocaed.dao.Solicitud_vaDao;
import com.upeu.edu.pe.sismocaed.entity.Solicitud_va;
import com.upeu.edu.pe.sismocaed.service.Solicitud_vaService;

@Service
public class Solicitud_vaServiceImp implements Solicitud_vaService{

	@Autowired
	private Solicitud_vaDao solicitud_vaDao;
	@Override
	public List<Solicitud_va> findAll() {
		// TODO Auto-generated method stub
		return (List<Solicitud_va>)solicitud_vaDao.findAll();
	}

	@Override
	public Solicitud_va findById(Long idsolicitud) {
		// TODO Auto-generated method stub
		return solicitud_vaDao.findById(idsolicitud).orElse(null);
	}

	@Override
	public Solicitud_va save(Solicitud_va solicitud) {
		// TODO Auto-generated method stub
		return solicitud_vaDao.save(solicitud);
	}

	@Override
	public void delete(Long idsolicitud) {
		// TODO Auto-generated method stub
		solicitud_vaDao.deleteById(idsolicitud);
		
	}
	
}