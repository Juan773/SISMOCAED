package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.PostulanteDao;
import com.upeu.edu.pe.sismocaed.entity.Postulante;
import com.upeu.edu.pe.sismocaed.service.PostulanteService;

@Service
public class PostulanteServiceImp implements PostulanteService{
	@Autowired
	private PostulanteDao postulanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Postulante> findAll() {
		// TODO Auto-generated method stub
		return (List<Postulante>)postulanteDao.findAll();
	}

	@Override
	public Postulante findById(Long idaprobacion) {
		// TODO Auto-generated method stub
		return postulanteDao.findById(idaprobacion).orElse(null);
	}

	@Override
	public Postulante save(Postulante postulante) {
		// TODO Auto-generated method stub
		return postulanteDao.save(postulante);
	}

	@Override
	public void delete(Long idpostulante) {
		// TODO Auto-generated method stub
		postulanteDao.deleteById(idpostulante);
	}

}
