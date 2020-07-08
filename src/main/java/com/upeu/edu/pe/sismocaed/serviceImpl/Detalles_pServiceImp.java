package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Detalles_pDao;
import com.upeu.edu.pe.sismocaed.entity.Detalles_p;
import com.upeu.edu.pe.sismocaed.service.Detalles_pService;

@Service
public class Detalles_pServiceImp implements Detalles_pService{
	
	@Autowired
	private Detalles_pDao detalles_pDao;

	@Override
	@Transactional(readOnly = true)
	public List<Detalles_p> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalles_p>) detalles_pDao.findAll();
	}

	@Override
	public Detalles_p findById(Long iddetalle_p) {
		// TODO Auto-generated method stub
		return detalles_pDao.findById(iddetalle_p).orElse(null);
	}

	@Override
	public Detalles_p save(Detalles_p detalles_p) {
		// TODO Auto-generated method stub
		return detalles_pDao.save(detalles_p);
	}

	@Override
	public void delete(Long iddetalle_p) {
		// TODO Auto-generated method stub
		detalles_pDao.deleteById(iddetalle_p);
	}

}
