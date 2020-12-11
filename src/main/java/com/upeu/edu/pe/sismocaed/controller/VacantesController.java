package com.upeu.edu.pe.sismocaed.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.upeu.edu.pe.sismocaed.entity.Vacantes;
import com.upeu.edu.pe.sismocaed.service.VacantesService;
import com.upeu.edu.pe.sismocaed.serviceImpl.VacanteService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis/cloud")
@RestController
public class VacantesController {
	@Autowired
	VacanteService vacanteService;
	
	@Autowired
	private VacantesService vacantesService;
	
	@GetMapping("/vacante")
	public List<Vacantes> readAll() {
		return vacantesService.findAll();
	}
	
	@GetMapping("/vacantes/{idvacante}")
	public Vacantes read(@PathVariable Long idvacante) {
		return vacantesService.findById(idvacante);
	}
	
	@DeleteMapping("/deletevac/{idvacante}")
	public void delete(@PathVariable Long idvacante) {
		vacantesService.delete(idvacante);
	}
	
	/*@PostMapping("/vacupload")
	public ResponseEntity<Map> upload(@RequestParam MultipartFile imagen, Vacantes vacantes) throws IOException{
		Map result = vacanteService.upload(imagen, vacantes);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}*/
	
	/*@DeleteMapping("/vacdelete/{id}")
	public ResponseEntity<Map> deletvac(@PathVariable("id") String id) throws IOException{
		Map result = vacanteService.delete(id);
		return new ResponseEntity<>(result, HttpStatus.OK); 
	}*/
	
	
	/*@PostMapping("/upload")
	public String guardar(@RequestParam(name = "imagen", required = false) MultipartFile foto, Vacantes vacantes,
			RedirectAttributes flash) {
		
		if(!foto.isEmpty()) {
			String ruta = "D://uploads";
			
			try {
				byte[] bytes= foto.getBytes();
				Path rutaabsoluta = Paths.get(ruta + "//" + foto.getOriginalFilename());
				Files.write(rutaabsoluta, bytes);
				vacantes.setImagen(foto.getOriginalFilename());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			vacantesService.save(vacantes);
			flash.addFlashAttribute("success", "Foto Subida !");
		}
		
		return "redirect:/";
	}*/
	
	@PostMapping("/savevacante")
	public Vacantes create(@Valid @ModelAttribute Vacantes vacantes, @RequestParam("file") MultipartFile imagen) {
		
		if(!imagen.isEmpty()) {
			Path directorioImagenes = Paths.get("src//main//resources//images");
			String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
			
			try {
				byte[] bytesImg = imagen.getBytes();
				Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
				Files.write(rutaCompleta, bytesImg);
				
				vacantes.setImagen(imagen.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return vacantesService.save(vacantes);
	}
}
