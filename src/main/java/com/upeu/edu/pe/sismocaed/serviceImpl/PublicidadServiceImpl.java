package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.PublicidadDao;
import com.upeu.edu.pe.sismocaed.entity.Publicidad;
import com.upeu.edu.pe.sismocaed.service.PublicidadService;
@Service
public class PublicidadServiceImpl implements PublicidadService{
	
	
	@Autowired
	private PublicidadDao publicidadDao;
	
	@Autowired
	private PublicidadService publicidadService;


	@Override
	@Transactional(readOnly = true)
	
	public List<Publicidad> findAll() {
		// TODO Auto-generated method stub
		return (List<Publicidad>) publicidadDao.findAll();
	}

	@Override
	public Publicidad findById(Long idpublicidad) {
		// TODO Auto-generated method stub
		return publicidadDao.findById(idpublicidad).orElse(null);
	}

	@Override
	public Publicidad save(Publicidad publicidad) {
		// TODO Auto-generated method stub
		return publicidadDao.save(publicidad);
	}

	@Override
	public void delete(Long idpublicidad) {
		// TODO Auto-generated method stub
		publicidadDao.deleteById(idpublicidad);
	}

	@Override
<<<<<<< HEAD
	public List<Publicidad> findByOrderById() {
		// TODO Auto-generated method stub
		return publicidadService.findByOrderById();
	}
	
	public Optional<Publicidad> getOne(long id){
		return publicidadDao.findById(id);
	}
	 public boolean exists(long id){
		 return publicidadDao.existsById(id);
	 }
=======
	public Optional<Publicidad> findById1(Long idpublicidad) {
		// TODO Auto-generated method stub
		return publicidadDao.findById(idpublicidad);
	}

	
	
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3

}
