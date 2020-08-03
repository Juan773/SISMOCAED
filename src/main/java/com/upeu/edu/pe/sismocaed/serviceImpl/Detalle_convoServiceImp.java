package com.upeu.edu.pe.sismocaed.serviceImpl;


import java.io.IOException;

import java.util.Collection;
import java.util.List;

import java.util.stream.Stream;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.dao.Detalle_convoDao;
import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;
import com.upeu.edu.pe.sismocaed.service.Detalle_convoService;

@Service
public class Detalle_convoServiceImp implements Detalle_convoService{

	@Autowired
	private Detalle_convoDao detalle_convoDao;
	@Autowired
	private EntityManager em;

	
	
	@Override
	@Transactional(readOnly = true)
	public List<Detalle_convo> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalle_convo>) detalle_convoDao.findAll();
	}

	@Override
	public Detalle_convo findById(Long iddetalle_convo) {
		// TODO Auto-generated method stub
		return detalle_convoDao.findById(iddetalle_convo).orElse(null);
	}

	@Override
	public Detalle_convo save(Detalle_convo detalle_convo) {
		// TODO Auto-generated method stub
		return detalle_convoDao.save(detalle_convo);
	}

	@Override
	public void delete(Long iddetalle_convo) {
		// TODO Auto-generated method stub
		detalle_convoDao.deleteById(iddetalle_convo);
	}
	
	public Detalle_convo store(MultipartFile file) throws IOException {
	String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	Detalle_convo Detalle_convo = new Detalle_convo(null, (String)fileName.concat("url_solicitud"), (String)fileName.concat("fecha"), (String)fileName.concat("url_carta"), (String)fileName.concat("url_curriculum"), (String)fileName.concat("descripcion"), null, null, file.getBytes());
	return detalle_convoDao.save(Detalle_convo);
    }
	
	public Detalle_convo storentity(Detalle_convo Detalle_convo) throws IOException{
		return detalle_convoDao.save(Detalle_convo);
	}
	
	public Detalle_convo getFile(Long iddetalle_convo) {
		return detalle_convoDao.findById(iddetalle_convo).get();
	}
	public Stream<Detalle_convo> getAllFiles(){
		return ((Collection<Detalle_convo>) detalle_convoDao.findAll()).stream();
	}

	//@Override
	//public Detalle_convo findByCodigo(String codigo) {
		// TODO Auto-generated method stub
	//	return detalle_convoDao.findByCodigo(codigo);
	//}
}
