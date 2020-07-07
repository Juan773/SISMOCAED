package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.Informe_maDao;
import com.upeu.edu.pe.sismocaed.entity.Informe_ma;

import com.upeu.edu.pe.sismocaed.service.Informe_maService;
@Service
public class Informe_maServiceImpl implements Informe_maService{
    @Autowired
    private Informe_maDao informe_maDao;
	@Override
	@Transactional(readOnly = true)

	public List<Informe_ma> findAll() {
		// TODO Auto-generated method stub
		return (List<Informe_ma>) informe_maDao.findAll();
	}

	@Override
	public Informe_ma findById(Long idinforme_maDao) {
		// TODO Auto-generated method stub
		return informe_maDao.findById(idinforme_maDao).orElse(null);	}

	@Override
	public Informe_ma save(Informe_ma informe_ma) {
		// TODO Auto-generated method stub
		return informe_maDao.save(informe_ma);
	}

	@Override
	public void delete(Long idinforme_maDao) {
		// TODO Auto-generated method stub
		informe_maDao.deleteById(idinforme_maDao);
	}



}
