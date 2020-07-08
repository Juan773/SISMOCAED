package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Detalle_convoDao;
import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;
import com.upeu.edu.pe.sismocaed.service.Detalle_convoService;

@Service
public class Detalle_convoServiceImp implements Detalle_convoService{

	@Autowired
	private Detalle_convoDao detalle_convoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Detalle_convo> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalle_convo>) detalle_convoDao.findAll();
	}

	@Override
	public Detalle_convo findById(Long iddetalle_convo) {
		// TODO Auto-generated method stub
		return detalle_convoDao.findById(iddetalle_convo).orElse(null);
	}

	@Override
	public Detalle_convo save(Detalle_convo detalle_convo) {
		// TODO Auto-generated method stub
		return detalle_convoDao.save(detalle_convo);
	}

	@Override
	public void delete(Long iddetalle_convo) {
		// TODO Auto-generated method stub
		detalle_convoDao.deleteById(iddetalle_convo);
	}

	
}
