package com.eletrongroup.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eletrongroup.app.dtos.PokemonDTO;
import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.repositories.PokemonRepository;

@Service
public class PokemonService {
	@Autowired
	private PokemonRepository pokemonRepository;
	
	public Pokemon savePokemon(PokemonDTO dto) {
		return pokemonRepository.save(dto.converterParaPokemon());
	}
}
