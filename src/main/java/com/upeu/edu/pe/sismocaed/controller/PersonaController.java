package com.upeu.edu.pe.sismocaed.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.upeu.edu.pe.sismocaed.entity.Persona;
import com.upeu.edu.pe.sismocaed.service.PersonaService;
@RequestMapping("/apisis")
@RestController
public class PersonaController {
      @Autowired
      private PersonaService personaService;
      @GetMapping("/persona")
      public List<Persona>readAll(){
    	  return (List<Persona>) personaService.findAll();
      }
      @GetMapping("persona/{idpersona}")
      public Persona read (@PathVariable Long idpersona) {
    	  return personaService.findById(idpersona);
      }
      

      @PostMapping("/persona")
      @ResponseStatus(HttpStatus.CREATED)
      public Persona create (@RequestBody Persona persona) {
    	  return personaService.save(persona);
      }
      

      @PutMapping("/editar/{idpersona}")
      public Persona update(@RequestBody Persona persona, @PathVariable Long idpersona) {
    	  Persona editar_persona = personaService.findById(idpersona);
    	  
    	  editar_persona.setNombre(persona.getNombre());
    	  editar_persona.setApellido(persona.getApellido());
    	  editar_persona.setCelular(persona.getCelular());
    	  editar_persona.setDni(persona.getDni());
    	  editar_persona.setDireccion(persona.getDireccion());
    	  editar_persona.setCorreo(persona.getCorreo());
    	  editar_persona.setFecha_n(persona.getFecha_n());
    	  
    	  return personaService.save(editar_persona);
    	  
      }
      

      @DeleteMapping("eliminarpersona/{idpersona}")
      public void delete(@PathVariable Long idpersona) {
    	  personaService.delete(idpersona);
    	  
     System.out.print("Persona Borrada");
      }
}
