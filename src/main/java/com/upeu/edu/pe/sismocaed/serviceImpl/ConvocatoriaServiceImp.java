package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.ConvocatoriaDao;
import com.upeu.edu.pe.sismocaed.entity.Convocatoria;
import com.upeu.edu.pe.sismocaed.service.ConvocatoriaService;

@Service
public class ConvocatoriaServiceImp implements ConvocatoriaService{
	
	@Autowired
	private ConvocatoriaDao convocatoriaDao;
	
	@Autowired
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Convocatoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Convocatoria>)	convocatoriaDao.findAll();
	}

	@Override
	public Convocatoria findById(Long idconvocatoria) {
		// TODO Auto-generated method stub
		return convocatoriaDao.findById(idconvocatoria).orElse(null);
	}

	@Override
	public Convocatoria save(Convocatoria convocatoria) {
		// TODO Auto-generated method stub
		return convocatoriaDao.save(convocatoria);
	}

	@Override
	public void delete(Long idconvocatoria) {
		// TODO Auto-generated method stub
		convocatoriaDao.deleteById(idconvocatoria);;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Convocatoria> convo_probyid(Long input) {
		// TODO Auto-generated method stub
		return em.createNamedStoredProcedureQuery("convo_probyid").setParameter("p_idconvocatoria", input).getResultList();
				}

}
