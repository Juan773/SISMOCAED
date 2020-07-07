package com.upeu.edu.pe.sismocaed.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.sismocaed.dao.UsuarioDao;
import com.upeu.edu.pe.sismocaed.entity.Usuario;
import com.upeu.edu.pe.sismocaed.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Usuario findById(Long idusuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(idusuario).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(Long idusuario) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(idusuario);
	}

	

}
