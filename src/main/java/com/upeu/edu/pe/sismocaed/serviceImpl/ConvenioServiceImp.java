package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.ConvenioDao;
import com.upeu.edu.pe.sismocaed.entity.Convenio;
import com.upeu.edu.pe.sismocaed.service.ConvenioService;

@Service
public class ConvenioServiceImp implements ConvenioService{
	
	@Autowired
	private ConvenioDao convenioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Convenio> findAll() {
		// TODO Auto-generated method stub
		return (List<Convenio>) convenioDao.findAll();
	}

	@Override
	public Convenio findById(Long idconvenio) {
		// TODO Auto-generated method stub
		return convenioDao.findById(idconvenio).orElse(null);
	}

	@Override
	public Convenio save(Convenio convenio) {
		// TODO Auto-generated method stub
		return convenioDao.save(convenio);
	}

	@Override
	public void delete(Long idconvenio) {
		// TODO Auto-generated method stub
		convenioDao.deleteById(idconvenio);
	}

}
