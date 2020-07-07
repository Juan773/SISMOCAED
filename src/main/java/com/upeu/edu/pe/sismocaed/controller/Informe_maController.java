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

import com.upeu.edu.pe.sismocaed.entity.Informe_ma;
import com.upeu.edu.pe.sismocaed.service.Informe_maService;
@RequestMapping("/apisis")
@RestController
public class Informe_maController {

	@Autowired
	private Informe_maService Informe_maService;
	@GetMapping("/informe_ma")
	public List<Informe_ma>readAll(){
		return (List<Informe_ma>) Informe_maService.findAll();
	}
	@GetMapping("informe_ma/{idinforme_ma}")
	public Informe_ma read (@PathVariable Long idinforme_ma) {
		return Informe_maService.findById(idinforme_ma);
		
	}
	@PostMapping("/informe_ma")
	@ResponseStatus(HttpStatus.CREATED)
	public Informe_ma create (@RequestBody Informe_ma informe_ma) {
		return Informe_maService.save(informe_ma);
		
	}
	@PutMapping("/editar/{idinforme_ma}")
	public Informe_ma update(@RequestBody Informe_ma informe_ma, @PathVariable Long idinforme_ma) {
		Informe_ma editar_informe_ma = Informe_maService.findById(idinforme_ma);
		editar_informe_ma.setTitulo(informe_ma.getTitulo());
		editar_informe_ma.setDescripcion(informe_ma.getDescripcion());
		editar_informe_ma.setFecha(informe_ma.getFecha());
		editar_informe_ma.setIdpostulante(informe_ma.getIdpostulante());
		return Informe_maService.save(editar_informe_ma);
		
	}
	@DeleteMapping("eliminarinforme_ma/{idinforme_ma}")
	public void delete(@PathVariable Long idinforme_ma) {
		Informe_maService.delete(idinforme_ma);
	  
        System.out.print("Informe Borrado");
	}

}
