package com.upeu.edu.pe.sismocaed.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.entity.Convocatoria;
import com.upeu.edu.pe.sismocaed.service.ConvocatoriaService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class ConvocatoriaController {
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@GetMapping("/convocatoria")
	public List<Convocatoria> findAll(){
		return (List<Convocatoria>) convocatoriaService.findAll();
	}

	@GetMapping("/convocatoria/{idconvocatoria}")
	public Convocatoria read(@PathVariable Long idconvocatoria) {
		return convocatoriaService.findById(idconvocatoria);
	}
	

	@PostMapping("/saveconvo")
	public Convocatoria create(@Valid @ModelAttribute Convocatoria convocatoria, @RequestParam("file") MultipartFile imagen) {
		
		if(!imagen.isEmpty()) {
			Path directorioImagenes = Paths.get("src//main//resources//images");
			String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
			
			try {
				byte[] bytesImg = imagen.getBytes();
				Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
				Files.write(rutaCompleta, bytesImg);
				
				convocatoria.setImagen(imagen.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return convocatoriaService.save(convocatoria);
	}
	

	@PutMapping("/editconvo/{idconvocatoria}")
	public Convocatoria update(@RequestBody Convocatoria convocatoria, @PathVariable Long idconvocatoria) {
		Convocatoria editar_convocatoria = convocatoriaService.findById(idconvocatoria);
		
		editar_convocatoria.setNombre_con(convocatoria.getNombre_con());
		editar_convocatoria.setFecha_ini(convocatoria.getFecha_ini());
		editar_convocatoria.setFecha_fin(convocatoria.getFecha_fin());
		editar_convocatoria.setDescripcion(convocatoria.getDescripcion());
		
		
		return convocatoriaService.save(editar_convocatoria);
	}
	

	@DeleteMapping("/deleteconvo/{idconvocatoria}")	
	public void delete(@PathVariable Long idconvocatoria) {
		convocatoriaService.delete(idconvocatoria);
	}
	@GetMapping("/convo_byid/{idconvocatoria}")
	public List<Convocatoria> findUniById(@PathVariable Long idconvocatoria){
	  	System.out.println(idconvocatoria);
		return convocatoriaService.convo_probyid(idconvocatoria);
	}

}
