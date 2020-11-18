package com.upeu.edu.pe.sismocaed.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import com.upeu.edu.pe.sismocaed.security.service.UserDetailServiceImp;

public class JwtTokenFilter extends OncePerRequestFilter{

	private final static Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);
	
	@Autowired
	JwtProvider jwtProvider;
	
	@Autowired
	UserDetailServiceImp userDetailsService;
	/*Va a comprobar si el token es valido o no*/
	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String token = getToken(req);
			/*Comprobamos si el token es valido*/
			if(token != null && jwtProvider.validateToken(token)) {
				String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token); //cargamos el token
				UserDetails userDetails = userDetailsService.loadUserByUsername(nombreUsuario); // obtenemos el usuario
				UsernamePasswordAuthenticationToken auth = new 
						UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities()); // autenticamos el usuario y la contraseña
			    SecurityContextHolder.getContext().setAuthentication(auth); //Contexto de Autenticación
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("fail en el metodo doFilter");
		}
		filterChain.doFilter(req, res); //filtramos el token
	}

	private String getToken(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		if( header!= null && header.startsWith("Bearer"))
			return header.replace("Bearer", "");
		return null;
	}
}
