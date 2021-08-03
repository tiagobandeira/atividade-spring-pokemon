package com.eletrongroup.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eletrongroup.app.dtos.PokemonDTO;
import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.services.PokemonService;

@RestController
@RequestMapping({"/pokemon"})
public class PokemonController {
	@Autowired
	private PokemonService pokemonService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pokemon save(@RequestBody PokemonDTO dto) {
		return pokemonService.savePokemon(dto);
	}

	@GetMapping("/{id}")
	public Pokemon get(@PathVariable Long id){
		return pokemonService.getPokemon(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody PokemonDTO dto){
		pokemonService.updatePokemon(id, dto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		pokemonService.deletePokemon(id);
	}
}
