package com.eletrongroup.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletrongroup.app.dtos.PokemonDTO;
import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.services.PokemonService;

@RestController
@RequestMapping({"/pokemon"})
public class PokemonController {
	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping
	public ResponseEntity<Pokemon> save(@RequestBody PokemonDTO dto) {
		Pokemon pokemon = pokemonService.savePokemon(dto);
		return new ResponseEntity<>(pokemon, HttpStatus.CREATED);
	}
}
