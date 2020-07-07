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

import com.upeu.edu.pe.sismocaed.entity.Universidad;
import com.upeu.edu.pe.sismocaed.service.UniversidadService;

@RequestMapping("/apisis")
@RestController
public class UniversidadController {

	@Autowired
	private UniversidadService universidadService;
	
    @GetMapping("/universidad")
    public List<Universidad> readAll(){
    	return (List<Universidad>) universidadService.findAll();
    }
    
    @GetMapping("/universidad/{iduniversidad}")
    public Universidad read(@PathVariable Long iduniversidad){
    	return universidadService.findById(iduniversidad);
    }
    
    @PostMapping("/universidad")
    @ResponseStatus(HttpStatus.CREATED)
    public Universidad create(@RequestBody Universidad universidad) {
    	return universidadService.save(universidad);
    }
    
    @PutMapping("/edituni/{iduniversidad}")
    public Universidad update(@RequestBody Universidad universidad, @PathVariable Long iduniversidad) {
        Universidad editar_universidad = universidadService.findById(iduniversidad);
        
        editar_universidad.setNombre(universidad.getNombre());
        editar_universidad.setDireccion(universidad.getDireccion());
        editar_universidad.setPais(universidad.getPais());
        editar_universidad.setTotalvacantes(universidad.getTotalvacantes());
        
        return universidadService.save(editar_universidad);
    }
    
    @DeleteMapping("/deleteuni/{iduniversidad}")
    public void delete(@PathVariable Long iduniversidad) {
    	universidadService.delete(iduniversidad);
    }
}
