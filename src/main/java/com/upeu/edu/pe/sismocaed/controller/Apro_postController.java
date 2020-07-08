package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Apro_post;
import com.upeu.edu.pe.sismocaed.service.Apro_postService;

@RequestMapping("/apisis")
@RestController
public class Apro_postController {

	@Autowired
	private Apro_postService apro_postService;
	
	@GetMapping("/apro_post")
	public List<Apro_post> readAll() {
		return (List<Apro_post>) apro_postService.findAll();
	}
	
	@GetMapping("/apro_post/{idapro_post}")
	public Apro_post read(@PathVariable Long idapro_post) {
		return apro_postService.findById(idapro_post);
	}
	
	@PostMapping("/saveapro_post")
	@ResponseStatus(HttpStatus.CREATED)
	public Apro_post create(@RequestBody Apro_post apro_post) {
		return apro_postService.save(apro_post);
	}
	
	@PutMapping("/editapro_post/{idapro_post}")
	public Apro_post update(@RequestBody Apro_post apro_post, @PathVariable Long idapro_post) {
	    Apro_post editar_apro_post = apro_postService.findById(idapro_post);
	    
        editar_apro_post.setIdaprobacion(apro_post.getIdaprobacion());
        editar_apro_post.setIdpostulante(apro_post.getIdpostulante());
        editar_apro_post.setFecha(apro_post.getFecha());
        
        return apro_postService.save(editar_apro_post);
	}
	
	@DeleteMapping("/deleteapro_post/{idapro_post}")
	public void delete(@PathVariable Long idapro_post) {
		apro_postService.delete(idapro_post);
	}
}
