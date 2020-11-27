package com.upeu.edu.pe.sismocaed.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Formulario_ma;
import com.upeu.edu.pe.sismocaed.service.Formulario_maService;
@RequestMapping("/apisis")
@RestController
public class Formulario_maController {
	
	@Autowired
	private Formulario_maService formulario_maService;
	@GetMapping("/formulario_ma")
	public List<Formulario_ma>readAll(){
		return (List<Formulario_ma>) formulario_maService.findAll();
	}
	@GetMapping("formulario_ma/{idrol}")
	public Formulario_ma read (@PathVariable Long idformulario_ma) {
		return formulario_maService.findById(idformulario_ma);
		
	}
	

	@PostMapping("/formulario_ma")
	@ResponseStatus(HttpStatus.CREATED)
	public Formulario_ma create (@RequestBody Formulario_ma formulario_ma) {
		return formulario_maService.save(formulario_ma);
		
	}
	

	@PutMapping("/editar/{idformulario_ma}")
	public Formulario_ma update(@RequestBody Formulario_ma formulario_ma, @PathVariable Long idformulario_ma) {
		Formulario_ma editar_formulario_ma = formulario_maService.findById(idformulario_ma);
		editar_formulario_ma.setEncargado_ep(formulario_ma.getEncargado_ep());
		editar_formulario_ma.setInvestigacion(formulario_ma.getInvestigacion());
		editar_formulario_ma.setRegistro_macol(formulario_ma.getRegistro_macol());
		editar_formulario_ma.setSemestre(formulario_ma.getSemestre());
		editar_formulario_ma.setSeminario(formulario_ma.getSeminario());
		editar_formulario_ma.setTerminos(formulario_ma.getTerminos());
		editar_formulario_ma.setU_destino(formulario_ma.getU_destino());
		editar_formulario_ma.setiddoc_aprobado(formulario_ma.getiddoc_aprobado());
		return formulario_maService.save(editar_formulario_ma);
		
	}
	

	@DeleteMapping("eliminarformulario_ma/{idformulario_ma}")
	public void delete(@PathVariable Long idformulario_ma) {
		formulario_maService.delete(idformulario_ma);
	  
        System.out.print("Formulario Borrado");
	}

}
