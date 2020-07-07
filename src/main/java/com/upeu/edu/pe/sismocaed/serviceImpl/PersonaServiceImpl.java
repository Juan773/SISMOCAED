package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.PersonaDao;
import com.upeu.edu.pe.sismocaed.entity.Persona;
import com.upeu.edu.pe.sismocaed.service.PersonaService;
@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public Persona findById(Long idpersona) {
		// TODO Auto-generated method stub
		return personaDao.findById(idpersona).orElse(null);
	}
		
	@Override
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	public void delete(Long idersona) {
		// TODO Auto-generated method stub
		personaDao.deleteById(idersona);
	}

}
