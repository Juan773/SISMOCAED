package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Solicitud_docenteDao;
import com.upeu.edu.pe.sismocaed.entity.Solicitud_docente;
import com.upeu.edu.pe.sismocaed.service.Solicitud_docenteService;
@Service

public class Solicitud_docenteServiceImp implements Solicitud_docenteService{
    @Autowired
    private Solicitud_docenteDao solicitud_docenteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Solicitud_docente> findAll() {
		// TODO Auto-generated method stub
		return (List<Solicitud_docente>)solicitud_docenteDao.findAll();
	}

	@Override
	public Solicitud_docente findById(Long idsol_doc) {
		// TODO Auto-generated method stub
		return solicitud_docenteDao.findById(idsol_doc).orElse(null);
	}

	@Override
	public Solicitud_docente save(Solicitud_docente solicitud_doc) {
		// TODO Auto-generated method stub
		return solicitud_docenteDao.save(solicitud_doc);
	}

	@Override
	public void delete(Long idsol_doc) {
		// TODO Auto-generated method stub.
		solicitud_docenteDao.deleteById(idsol_doc);
		
	}

}
