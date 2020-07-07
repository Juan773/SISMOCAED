package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Usu_rolDao;

import com.upeu.edu.pe.sismocaed.entity.Usu_rol;
import com.upeu.edu.pe.sismocaed.service.Usu_rolService;
@Service
public class Usu_rolServiceImpl implements Usu_rolService {

	
	@Autowired
	private Usu_rolDao usu_rolDao;
	@Override
	@Transactional(readOnly = true)
	public List<Usu_rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Usu_rol>) usu_rolDao.findAll();
	}

	@Override
	public Usu_rol findById(Long idusu_rol) {
		// TODO Auto-generated method stub
		return usu_rolDao.findById(idusu_rol).orElse(null);
	}

	@Override
	public Usu_rol save(Usu_rol usu_rol) {
		// TODO Auto-generated method stub
		 return usu_rolDao.save(usu_rol);
	}

	@Override
	public void delete(Long idusu_rol) {
		// TODO Auto-generated method stub
		usu_rolDao.deleteById(idusu_rol);

	}


	

}
