package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.entity.Publicidad;
import com.upeu.edu.pe.sismocaed.service.PublicidadService;

@RequestMapping("/apisis")
@RestController
public class PublicidadController {
	@Autowired
	private PublicidadService publicidadService;
	
	
	@GetMapping("/publicidad")
	public List<Publicidad>readAll(){
		return (List<Publicidad>) publicidadService.findAll();
	}
	@GetMapping("/")
	public String index( ) {
		return "uploadFileView";
	}
	
	@GetMapping("publicidad/{idpublicidad}")
	public Publicidad read (@PathVariable Long idpublicidad) {
		return publicidadService.findById(idpublicidad);
		
	}
	
	@PostMapping("/publicidad")
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public Publicidad create (@RequestBody Publicidad publicidad) {
		return publicidadService.save(publicidad);
			
	}
	@PutMapping("/editar/{idpublicidad}")
	public Publicidad update(@RequestBody Publicidad publicidad, @PathVariable Long idpublicidad) {
		Publicidad editar_publicidad = publicidadService.findById(idpublicidad);
		editar_publicidad.setTitulo(publicidad.getTitulo());
		editar_publicidad.setUrl_imagen(publicidad.getUrl_imagen());
		editar_publicidad.setEstado(publicidad.getEstado());
		editar_publicidad.setPic(publicidad.getPic());
		
		return publicidadService.save(editar_publicidad);
	}
	@DeleteMapping("/eliminarpublicidad/{idpublicidad}")
	public void delete(@PathVariable Long idpublicidad) {
		publicidadService.delete(idpublicidad);
	  
        System.out.print("Rol Borrado");
	}
	
	@RequestMapping(value = "/file/upload", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String uploadMultipartFile(@RequestParam("url_imagen") MultipartFile file) {
                
		try {
			Publicidad publicidad = new Publicidad(null, file.getOriginalFilename(), file.getContentType(), "1", file.getBytes());
			publicidadService.save(publicidad);
			return "File uploaded successfully! -> filename = " + file.getOriginalFilename();
		} catch (Exception e) {
			// TODO: handle exception
			return "FAIL! Maybe You had uploaded the file before or the file's size > 500KB";
		}
	}
	
	@GetMapping("/api/file/{idpublicidad}")
	  public ResponseEntity<byte[]> getFile(@PathVariable Long idpublicidad) {
	    Optional<Publicidad> fileOptional = publicidadService.findById1(idpublicidad);
	    
	    if(fileOptional.isPresent()) {
	      Publicidad file = fileOptional.get();
	      return ResponseEntity.ok()
	          .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getUrl_imagen() + "\"")
	          .body(file.getPic());  
	    }
	    
	    return ResponseEntity.status(404).body(null);
	  }

}
