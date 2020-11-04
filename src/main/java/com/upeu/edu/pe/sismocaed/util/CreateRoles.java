package com.upeu.edu.pe.sismocaed.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.upeu.edu.pe.sismocaed.security.entity.Rol;
import com.upeu.edu.pe.sismocaed.security.enums.RolNombre;
import com.upeu.edu.pe.sismocaed.security.service.RolService;

@Component
public class CreateRoles implements CommandLineRunner{
	
	@Autowired
	RolService rolService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/**Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
		Rol rolUser = new Rol(RolNombre.ROLE_USER);
		rolService.save(rolAdmin);
		rolService.save(rolUser);**/
	}

}
