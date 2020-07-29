package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.dao.Requisitos_aDao;
import com.upeu.edu.pe.sismocaed.entity.E_Profesional;
import com.upeu.edu.pe.sismocaed.entity.Requisitos_a;
import com.upeu.edu.pe.sismocaed.exception.FileStorageException;
import com.upeu.edu.pe.sismocaed.service.Requisitos_aService;


@Service
public class Requisitos_aServiceImp implements Requisitos_aService{

	@Autowired
	private Requisitos_aDao requisitos_aDao;
    @Autowired
    private EntityManager em;
    
	@Override
	@Transactional(readOnly = true)
	public List<Requisitos_a> findAll() {
		// TODO Auto-generated method stub
		return (List<Requisitos_a>) requisitos_aDao.findAll();
	}

	@Override
	public Requisitos_a findById(Long idrequisitos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.findById(idrequisitos_a).orElse(null);
	}

	@Override
	public Requisitos_a save(Requisitos_a requisitos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.save(requisitos_a);
	}

	@Override
	public void delete(Long idrequisitos_a) {
		// TODO Auto-generated method stub
	    requisitos_aDao.deleteById(idrequisitos_a);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Requisitos_a> getReq_aProcedure() {
		// TODO Auto-generated method stub
		return em.createNamedStoredProcedureQuery("list_procedure").getResultList();
	}

	@Override
	@PostMapping("/upload/file")
	public Requisitos_a storeFile(MultipartFile file, Requisitos_a requisitos_a) {
		// TODO Auto-generated method stub
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    String descri = StringUtils.cleanPath(requisitos_a.getDescripcion());
	    E_Profesional ide_pro = requisitos_a.getIde_profesional();
	    
	    
	    try {
	    	//Check if the file´s name contains invalid characters
			if(fileName.contains("..")) {
				 throw new FileStorageException("Sorry ! Filename contains invalid path sequence " + fileName);
			}
			
			Requisitos_a  requi_a = new Requisitos_a(null, descri, fileName, file.getContentType(), ide_pro, file.getBytes());
			return requisitos_aDao.save(requi_a);
		} catch (IOException ex) {
			// TODO: handle exception
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	@Override
	public Requisitos_a getFile(Long idrequisitos_a) {
		// TODO Auto-generated method stub
		return requisitos_aDao.findById(idrequisitos_a).orElseThrow(null);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Requisitos_a> getFormato012() {
		// TODO Auto-generated method stub
		return em.createNamedStoredProcedureQuery("list_formato012").getResultList();
	}

	@Override
	public List<Requisitos_a> listprocedure() {
		// TODO Auto-generated method stub
		return requisitos_aDao.listprocedure();
	}
	
	
}
