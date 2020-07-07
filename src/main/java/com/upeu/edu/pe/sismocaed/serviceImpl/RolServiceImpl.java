package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.RolDao;

import com.upeu.edu.pe.sismocaed.entity.Rol;

import com.upeu.edu.pe.sismocaed.service.RolService;
@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
	private RolDao rolDao;
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
	return (List<Rol>) rolDao.findAll();

	}

	@Override
	public Rol findById(Long idrol) {
		// TODO Auto-generated method stub
		return rolDao.findById(idrol).orElse(null);
	}

	@Override
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.save(rol);
	}

	@Override
	public void delete(Long idrol) {
		// TODO Auto-generated method stub
		rolDao.deleteById(idrol);
	}

}
