package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.upeu.edu.pe.sismocaed.dao.TrabajadorDao;
import com.upeu.edu.pe.sismocaed.entity.Trabajador;
import com.upeu.edu.pe.sismocaed.service.TrabajadorService;
@Service
public class TrabajadorServiceImpl implements TrabajadorService{
    
	
	@Autowired
	private TrabajadorDao trabajadorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Trabajador> findAll() {
		// TODO Auto-generated method stub
		return (List<Trabajador>) trabajadorDao.findAll();
		
	}

	@Override
	public Trabajador findById(Long idtrabajador) {
		// TODO Auto-generated method stub
		return trabajadorDao.findById(idtrabajador).orElse(null);
	}

	@Override
	public Trabajador save(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return trabajadorDao.save(trabajador);
	}

	@Override
	public void delete(Long idtrabajador) {
		// TODO Auto-generated method stub
		trabajadorDao.deleteById(idtrabajador);
		
	}


}
