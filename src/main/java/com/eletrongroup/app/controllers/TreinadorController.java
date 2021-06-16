package com.eletrongroup.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletrongroup.app.dtos.TreinadorDTO;
import com.eletrongroup.app.entities.Treinador;
import com.eletrongroup.app.services.TreinadorService;

@RestController
@RequestMapping({"/trainer"})
public class TreinadorController {
	@Autowired
	private TreinadorService treinadorService;
	
	@PostMapping
	public ResponseEntity<Treinador> save(@RequestBody TreinadorDTO dto) {
		Treinador treinador = treinadorService.saveTreinador(dto);
		return new ResponseEntity<>(treinador, HttpStatus.CREATED);
	}

}
