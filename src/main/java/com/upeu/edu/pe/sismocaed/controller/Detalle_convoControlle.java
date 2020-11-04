package com.upeu.edu.pe.sismocaed.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;
import com.upeu.edu.pe.sismocaed.message.ResponseMessage;
import com.upeu.edu.pe.sismocaed.service.Detalle_convoService;
import com.upeu.edu.pe.sismocaed.serviceImpl.Detalle_convoServiceImp;


@RequestMapping("/apisis")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)


@RestController
public class Detalle_convoControlle {

	@Autowired
	private Detalle_convoService detalle_convoService;
	
	@Autowired
	Detalle_convoServiceImp detalle_convoServiceImp;
	
	@GetMapping("/detalle_convo")
	public List<Detalle_convo> readAll(){
		return (List<Detalle_convo>) detalle_convoService.findAll();
	}
	
	@GetMapping("/detalle_convo/{iddetalle_convo}")
	public Detalle_convo read(@PathVariable Long iddetalle_convo) {
		return detalle_convoService.findById(iddetalle_convo);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/savedeta_conv")
	@ResponseStatus(HttpStatus.CREATED)
	public Detalle_convo create(@RequestBody Detalle_convo detalle_convo){
		return detalle_convoService.save(detalle_convo);
	}
	

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editdeta_conv/{iddetalle_convo}")
	public Detalle_convo update(@RequestBody Detalle_convo detalle_convo, @PathVariable Long iddetalle_convo) {
		Detalle_convo editar_convo = detalle_convoService.findById(iddetalle_convo);
		
	    editar_convo.setUrl_solicitud(detalle_convo.getUrl_solicitud());
	    editar_convo.setFecha(detalle_convo.getFecha());;
	    editar_convo.setUrl_carta(detalle_convo.getUrl_carta());
	    editar_convo.setUrl_curriculum(detalle_convo.getUrl_curriculum());
	    editar_convo.setDescripcion(detalle_convo.getDescripcion());
	    editar_convo.setIdconvocatoria(detalle_convo.getIdconvocatoria());
	    editar_convo.setIdpostulante(detalle_convo.getIdpostulante());
	    
	    return detalle_convoService.save(editar_convo);
	}
	

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deletedeta_conv/{iddetalle_convo}")
	public void delete(@PathVariable Long iddetalle_convo) {
		detalle_convoService.delete(iddetalle_convo);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/upload")
	 public ResponseEntity<ResponseMessage> uploadFile(@RequestBody Detalle_convo detalle_convo)
			  {
		    String message = "hola";
			
		    try {
		    	/*
		    	 * @RequestParam("file1") MultipartFile file1,
			 @RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3
		    	 * 
		    	 * int numero=0;
				for (int i=1; i<4; i++) {
			    //	System.out.println("numero "+i);
			    	numero =i;
			    	switch (numero) {
					case 1: Detalle_convo.setUrl_carta((file1.getOriginalFilename()));
						break;
					case 2: Detalle_convo.setUrl_curriculum((file2.getOriginalFilename()));
						break;
					case 3: Detalle_convo.setUrl_solicitud((file3.getOriginalFilename()));
						break;
					}
			    }
		    	*/
		    	
		    	
		    	Detalle_convo Detalle_convo = new Detalle_convo();
				Detalle_convo.setUrl_carta(detalle_convo.getUrl_carta());
				Detalle_convo.setUrl_curriculum(detalle_convo.getUrl_curriculum());
				Detalle_convo.setUrl_solicitud(detalle_convo.getUrl_solicitud());
				//Detalle_convo.setData(file1.getBytes());
				Detalle_convo.setDescripcion(detalle_convo.getDescripcion());
				Detalle_convo.setFecha(detalle_convo.getFecha());
				Detalle_convo.setIdconvocatoria(detalle_convo.getIdconvocatoria());
				Detalle_convo.setIdpostulante(null);
				
				System.out.println(detalle_convo.toString());
				detalle_convoServiceImp.storentity(Detalle_convo);
		    	//detalle_convoServiceImp.store(file1);
		    	//message = "Uploaded the file successfully: " + file1.getOriginalFilename()+file2.getOriginalFilename()+file3.getOriginalFilename();
		    	return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		    }catch (Exception e) {
		    	message = "Could not upload the file: " + detalle_convo.getUrl_carta()+ "!";
		    	return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		    }
	 }
	@GetMapping("/prueba")
	public Integer Nombre() {
		System.out.println("entro en prueba");
		int numero=0;
		for (int i=1; i<4; i++) {
	    	System.out.println("numero "+i);
	    	numero =i;
	    }		
		return numero;
	}
	//@GetMapping("/cod/{{codigo}}")
	//public Detalle_convo buscarCodigo(@PathVariable("codigo") String codigo) {
	//return detalle_convoService.findByCodigo(codigo);
//}
}