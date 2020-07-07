package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Doc_aprobadoDao;

import com.upeu.edu.pe.sismocaed.entity.Doc_aprobado;

import com.upeu.edu.pe.sismocaed.service.Doc_aprobadoService;
@Service
public class Doc_aprobadoServiceImpl implements Doc_aprobadoService {
    

	@Autowired
	private Doc_aprobadoDao doc_aprobadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Doc_aprobado> findAll() {
		// TODO Auto-generated method stub
		return (List<Doc_aprobado>) doc_aprobadoDao.findAll();
	}

	@Override
	public Doc_aprobado findById(Long iddoc_aprobado) {
		// TODO Auto-generated method stub
		return doc_aprobadoDao.findById(iddoc_aprobado).orElse(null);
	}

	@Override
	public Doc_aprobado save(Doc_aprobado doc_aprobado) {
		// TODO Auto-generated method stub
		return doc_aprobadoDao.save(doc_aprobado);
	}

	@Override
	public void delete(Long iddoc_aprobado) {
		// TODO Auto-generated method stub
		doc_aprobadoDao.deleteById(iddoc_aprobado);

	}



}
