package com.eletrongroup.app.controllers;

import com.eletrongroup.app.enums.TipoPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eletrongroup.app.dtos.PokemonDTO;
import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.services.PokemonService;

import java.util.List;

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

	@GetMapping("/byTipo/{tipo}")
	public List<Pokemon> getByTipo(@PathVariable String tipo){
		return pokemonService.getPokemonByTipo(tipo);
	}

	@GetMapping("/byGeracao/{geracao}")
	public List<Pokemon> getByGeracao(@PathVariable int geracao){
		return pokemonService.getPokemonByGeracao(geracao);
	}
}
