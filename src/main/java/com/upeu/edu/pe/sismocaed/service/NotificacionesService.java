package com.upeu.edu.pe.sismocaed.service;

import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Notificaciones;

public interface NotificacionesService {

	public List<Notificaciones> findAll();
	public Notificaciones findById(Long idnotifiacion);
	public Notificaciones save(Notificaciones notificaciones);
    public void delete(Long idnotificacion);
}
