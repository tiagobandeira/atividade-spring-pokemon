package com.eletrongroup.app.controllers;

import java.util.List;

import com.eletrongroup.app.dtos.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eletrongroup.app.dtos.TreinadorDTO;
import com.eletrongroup.app.entities.Treinador;
import com.eletrongroup.app.services.TreinadorService;


@RestController
@RequestMapping({"/trainer"})
public class TreinadorController {
	@Autowired
	private TreinadorService treinadorService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Treinador save(@RequestBody TreinadorDTO dto) {
		Treinador treinador = treinadorService.saveTreinador(dto);
		return treinador;
	}
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody TreinadorDTO dto){
		treinadorService.updateTreinador(id, dto);
	}

	@GetMapping("/{id}")
    public Treinador get(@PathVariable Long id) {
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
	public void delete(@PathVariable("id") Long id ){
		treinadorService.deleteTreinador(id);
	}

}
