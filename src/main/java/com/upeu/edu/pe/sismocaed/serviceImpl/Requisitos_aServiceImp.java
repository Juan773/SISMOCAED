package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Requisitos_aDao;
import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;
import com.upeu.edu.pe.sismocaed.service.Requisitos_aService;

@Service
public class Requisitos_aServiceImp implements Requisitos_aService{

	@Autowired
	private Requisitos_aDao requisitos_aDao;
    @Autowired
    private EntityManager em;
    
	@Override
	@Transactional(readOnly = true)
	public List<Requisitos_a> findAll() {
		// TODO Auto-generated method stub
		return (List<Requisitos_a>) requisitos_aDao.findAll();
	}

	@Override
	public Requisitos_a findById(Long idrequisitos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.findById(idrequisitos_a).orElse(null);
	}

	@Override
	public Requisitos_a save(Requisitos_a requisitos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.save(requisitos_a);
	}

	@Override
	public void delete(Long idrequisitos_a) {
		// TODO Auto-generated method stub
	    requisitos_aDao.deleteById(idrequisitos_a);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Requisitos_a> getReq_aProcedure() {
		// TODO Auto-generated method stub
		return em.createNamedStoredProcedureQuery("list_procedure").getResultList();
	}

	@Override
	public Optional<Requisitos_a> findById1(Long idrequistos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.findById(idrequistos_a);
	}
	
	
}
