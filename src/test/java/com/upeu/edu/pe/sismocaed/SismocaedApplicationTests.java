package com.upeu.edu.pe.sismocaed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.upeu.edu.pe.sismocaed.dao.UsuarioDao;
import com.upeu.edu.pe.sismocaed.entity.Usuario;

@SpringBootTest
class SismocaedApplicationTests {
	
	@Autowired
	UsuarioDao usuarioDao;
	@Test
	void contextLoads() {
		/*Usuario usuario = new Usuario();
		usuario.setUsername("sandy");
		usuario.setPassword("sandy123");
		usuario.setEnabled(true);
		System.out.println(usuarioDao.save(usuario));*/
	}
	
}
