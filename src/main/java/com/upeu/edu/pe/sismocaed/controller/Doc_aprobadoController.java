package com.upeu.edu.pe.sismocaed.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.upeu.edu.pe.sismocaed.entity.Doc_aprobado;
import com.upeu.edu.pe.sismocaed.service.Doc_aprobadoService;
@RequestMapping("/apisis")
@RestController
public class Doc_aprobadoController {
	
    @Autowired
    private Doc_aprobadoService doc_aprobadoService;
    @GetMapping("/doc_aprobado")
    public List<Doc_aprobado>readAll(){
  	  return (List<Doc_aprobado>) doc_aprobadoService.findAll();
    }
    @GetMapping("doc_aprobado/{iddoc_aprobado}")
    public Doc_aprobado read (@PathVariable Long iddoc_aprobado) {
  	  return doc_aprobadoService.findById(iddoc_aprobado);
    }
    @PostMapping("/doc_aprobado")
    @ResponseStatus(HttpStatus.CREATED)
    public Doc_aprobado create (@RequestBody Doc_aprobado doc_aprobado) {
  	  return doc_aprobadoService.save(doc_aprobado);
    }
    /**
     * @param doc_aprobado
     * @param iddoc_aprobado
     * @return
     */
    @PutMapping("/editar/{iddoc_aprobado}")
    public Doc_aprobado update(@RequestBody Doc_aprobado doc_aprobado, @PathVariable Long iddoc_aprobado) {
    	Doc_aprobado editar_doc_aprobado = doc_aprobadoService.findById(iddoc_aprobado);
    	editar_doc_aprobado.setCodigoap(doc_aprobado.getCodigoap());
    	editar_doc_aprobado.setDoc_antecedentes_policiales(doc_aprobado.getDoc_antecedentes_policiales());
    	editar_doc_aprobado.setDoc_certificado_salud(doc_aprobado.getDoc_certificado_salud());
    	editar_doc_aprobado.setDoc_copia_dni(doc_aprobado.getDoc_copia_dni());
    	editar_doc_aprobado.setDoc_copia_pass(doc_aprobado.getDoc_copia_pass());
    	editar_doc_aprobado.setDoc_curriculum_vitae(doc_aprobado.getDoc_curriculum_vitae());
    	editar_doc_aprobado.setFecha(doc_aprobado.getFecha());
    	editar_doc_aprobado.setIdpostulante(doc_aprobado.getIdpostulante());
    	editar_doc_aprobado.setIdtrabajador(doc_aprobado.getIdtrabajador());
    	

  	  
  	  return doc_aprobadoService.save(editar_doc_aprobado);
  	  
    }
    @DeleteMapping("eliminardoc_aprobado/{iddoc_aprobado}")
    public void delete(@PathVariable Long iddoc_aprobado) {
    	doc_aprobadoService.delete(iddoc_aprobado);
  	  
   System.out.print("Documento Borrado");
    }
}
