package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Reque_convoDao;
import com.upeu.edu.pe.sismocaed.entity.Reque_convo;
import com.upeu.edu.pe.sismocaed.service.Reque_convoService;

@Service
public class Reque_convoServiceImp implements Reque_convoService{
	
     @Autowired
     private Reque_convoDao reque_convoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Reque_convo> findAll() {
		// TODO Auto-generated method stub
		return (List<Reque_convo>) reque_convoDao.findAll();
	}

	@Override
	public Reque_convo findById(Long idreque_convo) {
		// TODO Auto-generated method stub
		return reque_convoDao.findById(idreque_convo).orElse(null);
	}

	@Override
	public Reque_convo save(Reque_convo reque_convo) {
		// TODO Auto-generated method stub
		return reque_convoDao.save(reque_convo);
	}

	@Override
	public void delete(Long idreque_convo) {
		// TODO Auto-generated method stub
		reque_convoDao.deleteById(idreque_convo);
	}

}
