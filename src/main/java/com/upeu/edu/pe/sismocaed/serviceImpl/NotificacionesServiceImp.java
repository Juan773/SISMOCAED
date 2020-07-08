package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.NotificacionesDao;
import com.upeu.edu.pe.sismocaed.entity.Notificaciones;
import com.upeu.edu.pe.sismocaed.service.NotificacionesService;

@Service
public class NotificacionesServiceImp implements NotificacionesService{

	@Autowired
	private NotificacionesDao notificacionesDao;
	@Override
	@Transactional(readOnly = true)
	public List<Notificaciones> findAll() {
		// TODO Auto-generated method stub
		return (List<Notificaciones>) notificacionesDao.findAll();
	}

	@Override
	public Notificaciones findById(Long idnotifiacion) {
		// TODO Auto-generated method stub
		return notificacionesDao.findById(idnotifiacion).orElse(null);
	}

	@Override
	public Notificaciones save(Notificaciones notificaciones) {
		// TODO Auto-generated method stub
		return notificacionesDao.save(notificaciones);
	}

	@Override
	public void delete(Long idnotificacion) {
		// TODO Auto-generated method stub
		notificacionesDao.deleteById(idnotificacion);
	}

}
