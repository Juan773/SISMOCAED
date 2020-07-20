package com.upeu.edu.pe.sismocaed.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
<<<<<<< HEAD
import java.util.Map;
import javax.imageio.ImageIO;
=======
import java.util.Optional;
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

<<<<<<< HEAD
import com.upeu.edu.pe.sismocaed.entity.Mensaje;
import com.upeu.edu.pe.sismocaed.entity.Publicidad;
import com.upeu.edu.pe.sismocaed.serviceImpl.PublicidadServiceImpl;
import com.upeu.edu.pe.sismocaed.serviceImpl.PublicidService;

=======
import com.upeu.edu.pe.sismocaed.entity.Publicidad;
import com.upeu.edu.pe.sismocaed.service.PublicidadService;

@RequestMapping("/apisis")
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
@RestController
@RequestMapping("/publicidad")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PublicidadController {
	
	@Autowired
<<<<<<< HEAD
	private PublicidService publicidService;
	
	@Autowired
	private PublicidadServiceImpl publicidadServiceImpl;
	
	@GetMapping("/listar-publi")
=======
	private PublicidadService publicidadService;
	
	
	@GetMapping("/publicidad")
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
	public List<Publicidad>readAll(){
		return (List<Publicidad>) publicidadServiceImpl.findAll();
	}
	@GetMapping("/")
	public String index( ) {
		return "uploadFileView";
	}
<<<<<<< HEAD

=======
	
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
	@GetMapping("publicidad/{idpublicidad}")
	public Publicidad read (@PathVariable Long idpublicidad) {
		return publicidadServiceImpl.findById(idpublicidad);
		
	}
	
	@PostMapping("/publicidad")
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public Publicidad create (@RequestBody Publicidad publicidad) {
<<<<<<< HEAD
		return publicidadServiceImpl.save(publicidad);
		
=======
		return publicidadService.save(publicidad);
			
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
	}
	@PutMapping("/editar/{idpublicidad}")
	public Publicidad update(@RequestBody Publicidad publicidad, @PathVariable Long idpublicidad) {
		Publicidad editar_publicidad = publicidadServiceImpl.findById(idpublicidad);
		editar_publicidad.setTitulo(publicidad.getTitulo());
		editar_publicidad.setUrl_imagen(publicidad.getUrl_imagen());
		editar_publicidad.setImagenId(publicidad.getImagenId());
		editar_publicidad.setEstado(publicidad.getEstado());
<<<<<<< HEAD
		return publicidadServiceImpl.save(editar_publicidad);
=======
		editar_publicidad.setPic(publicidad.getPic());
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
		
		return publicidadService.save(editar_publicidad);
	}
<<<<<<< HEAD
	@DeleteMapping("eliminar/{id}")
=======
	@DeleteMapping("/eliminarpublicidad/{idpublicidad}")
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
	public void delete(@PathVariable Long idpublicidad) {
		publicidadServiceImpl.delete(idpublicidad);
	  
        System.out.print("Rol Borrado");
	}
<<<<<<< HEAD
	 @GetMapping("/list")
	 public ResponseEntity<List<Publicidad>> findByOrderById(){
		List<Publicidad> findByOrderById = publicidadServiceImpl.findByOrderById();
		 return new ResponseEntity(findByOrderById, HttpStatus.OK);
		 
	 }
	  @PostMapping("/upload")
	   public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile)throws IOException {
		  BufferedImage bi = ImageIO.read(multipartFile.getInputStream());
	        if(bi == null){
	            return new ResponseEntity(new Mensaje("imagen no válida"), HttpStatus.BAD_REQUEST);
	        }
	        Map result = publicidService.upload(multipartFile);
	        Publicidad publicidad = 
	        		new Publicidad((String)result.get("original_filename"),
	        		 (String)result.get("url"),
                     (String)result.get("public_id"),
                     (String)result.get("estado"));
	        publicidadServiceImpl.save(publicidad);
	        return new ResponseEntity(new Mensaje("imagen subida"), HttpStatus.OK);		
	  }
	  @DeleteMapping("/delete/{id}")
	  public ResponseEntity<?> delete(@PathVariable("id") long idpublicidad)throws IOException {
		  if(!publicidadServiceImpl.exists(idpublicidad))
			  return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		  Publicidad publicidad = publicidadServiceImpl.getOne(idpublicidad).get();
		  Map result = publicidService.delete(publicidad.getImagenId());
		  publicidadServiceImpl.delete(idpublicidad);
		  return new ResponseEntity(new Mensaje("imagen eliminada"), HttpStatus.OK); 
	  }
}
=======
	
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
>>>>>>> 0e152cd4e9eed6c63927afd22b1d7a09d66771a3
