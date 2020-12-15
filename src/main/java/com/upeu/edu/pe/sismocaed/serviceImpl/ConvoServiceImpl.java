package com.upeu.edu.pe.sismocaed.serviceImpl;

import org.springframework.stereotype.Service;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.ConvoDao;
import com.upeu.edu.pe.sismocaed.entity.Convo;
import com.upeu.edu.pe.sismocaed.service.ConvoService;
@Service
public class ConvoServiceImpl implements ConvoService{
     @Autowired
     private ConvoDao convoDao;
     
     @Autowired
  
 	@Transactional(readOnly = true)
	@Override
	public List<Convo> findAll() {
		// TODO Auto-generated method stub
		return (List<Convo>) convoDao.findAll();
	}

}
