package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Reque_convo;
import com.upeu.edu.pe.sismocaed.service.Reque_convoService;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/apisis")
@RestController
public class Reque_convoController {

     @Autowired
     private Reque_convoService reque_convoService;
     
     @GetMapping("/reque_convo")
     public List<Reque_convo> readAll(){
    	 return reque_convoService.findAll();
     }
     
     @GetMapping("/reque_convo/{idreque_convo}")
     public Reque_convo read(@PathVariable Long idreque_convo) {
    	 return reque_convoService.findById(idreque_convo);
     }
     

     @PostMapping("/savereq_conv")
     public Reque_convo create(@RequestBody Reque_convo reque_convo) {
    	 return reque_convoService.save(reque_convo);
     }
     
 
     @PutMapping("/editreq_convo/{idreque_convo}")
     public Reque_convo update(@RequestBody Reque_convo reque_convo, @PathVariable Long idreque_convo) {
    	 Reque_convo editar_reque_conv = reque_convoService.findById(idreque_convo);
    	 
    	 editar_reque_conv.setIdrequisito(reque_convo.getIdrequisito());
    	 editar_reque_conv.setIdconvocatoria(reque_convo.getIdconvocatoria());
    	 editar_reque_conv.setEstado(reque_convo.getEstado());
    	 
    	 return reque_convoService.save(editar_reque_conv);
     }
     
     

     @DeleteMapping("/deletereque_conv/{idreque_convo}")
     public void delete(@PathVariable Long idreque_convo) {
    	 reque_convoService.delete(idreque_convo);
     }
}
