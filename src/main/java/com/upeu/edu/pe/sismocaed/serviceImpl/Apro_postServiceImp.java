package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Apro_postDao;
import com.upeu.edu.pe.sismocaed.entity.Apro_post;
import com.upeu.edu.pe.sismocaed.service.Apro_postService;

@Service
public class Apro_postServiceImp implements Apro_postService{
	
	@Autowired
	private Apro_postDao apro_postDao;

	@Override
	@Transactional(readOnly = true)
	public List<Apro_post> findAll() {
		// TODO Auto-generated method stub
		return (List<Apro_post>) apro_postDao.findAll();
	}

	@Override
	public Apro_post findById(Long idapro_post) {
		// TODO Auto-generated method stub
		return apro_postDao.findById(idapro_post).orElse(null);
	}

	@Override
	public Apro_post save(Apro_post apro_post) {
		// TODO Auto-generated method stub
		return apro_postDao.save(apro_post);
	}

	@Override
	public void delete(Long idapro_post) {
		// TODO Auto-generated method stub
		apro_postDao.deleteById(idapro_post);
	}

}
