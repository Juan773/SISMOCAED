package com.upeu.edu.pe.sismocaed.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.upeu.edu.pe.sismocaed.dao.UsuarioDao;
import com.upeu.edu.pe.sismocaed.entity.Usuario;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	Gson gson = new Gson();
	
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = usuarioDao.findAll(authentication.getName());
		Map<String, Object> datos = new HashMap<>();
		datos.put("idusuario", user.getIdusuario());
		datos.put("usuario", user.getNombreUsuario());
		
		return accessToken;
	}
	
	
	
}
