package com.upeu.edu.pe.sismocaed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.sismocaed.entity.Convo;
import com.upeu.edu.pe.sismocaed.service.ConvoService;

@RequestMapping("/apisis")
@RestController
public class ConvoController {
@Autowired
ConvoService convoService;


@GetMapping("/convo")
public List<Convo> readAll(){
	return convoService.findAll();
	
}
}
