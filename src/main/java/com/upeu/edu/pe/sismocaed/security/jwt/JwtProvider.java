package com.upeu.edu.pe.sismocaed.security.jwt;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.upeu.edu.pe.sismocaed.security.entity.UsuarioPrincipal;

import io.jsonwebtoken.*;

@Component
public class JwtProvider {
 
	private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("#{new Integer('${jwt.expiration}')}")
	private int expiration;
	
	/*Generamos el token*/
	public String generateToken(Authentication authentication) {
		UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
		return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime() + expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();
	}
	
	public String getNombreUsuarioFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return true;
		} catch (MalformedJwtException e) {
			// TODO: handle exception
			 logger.error("token mal formado");
		}catch (UnsupportedJwtException e) {
			// TODO: handle exception
			 logger.error("token no soportado");
		}catch (ExpiredJwtException e) {
			// TODO: handle exception
			 logger.error("token expirado");
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			 logger.error("token vacio");
		}catch (SignatureException e) {
			// TODO: handle exception
			 logger.error("fail en la firma");
		}
		return false;
	}
}
