package com.eletrongroup.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/{id}")
    public Treinador find(@PathVariable Long id) {
        return treinadorService.getTreinador(id);
    }
	@GetMapping("/byAge/{age}")
	public List<Treinador> getByAge(@PathVariable Long age){
		return treinadorService.getTreinadorByAge(age);
	}
	@GetMapping("/byAll")
	public List<String> getAll(){
		return treinadorService.getAllTreinador();
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id ){
		return treinadorService.deleteTreinador(id);
	}

}
