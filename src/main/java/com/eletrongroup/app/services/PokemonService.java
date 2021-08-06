package com.eletrongroup.app.services;

import com.eletrongroup.app.enums.TipoPokemon;
import com.eletrongroup.app.exception.NotFoudException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.eletrongroup.app.dtos.PokemonDTO;
import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.repositories.PokemonRepository;

import java.util.List;

@Service
public class PokemonService {
	@Autowired
	private PokemonRepository pokemonRepository;
	
	public Pokemon savePokemon(PokemonDTO dto) {
		return pokemonRepository.save(dto.converterParaPokemon());
	}

	public void updatePokemon(Long id, PokemonDTO dto){
		Pokemon pokemon = getPokemon(id);
		Pokemon response = dto.converterParaPokemon();

		pokemon.setNome(response.getNome());
		pokemon.setTipo(response.getTipo());
		pokemon.setPrevolution(response.getPrevolution());
		pokemon.setEvolution(response.getEvolution());
		pokemon.setIsLendario(response.getIsLendario());

		pokemonRepository.save(pokemon);
	}

	public void deletePokemon(Long id){
		Pokemon pokemon = getPokemon(id);
		pokemonRepository.delete(pokemon);
	}
	public Pokemon getPokemon(Long id){
		Pokemon pokemon = pokemonRepository.getPokemonById(id);
		if(pokemon == null){
			throw new NotFoudException();
		}
		return pokemon;
	}

	public List<Pokemon> getPokemonByTipo(String tipo){
		TipoPokemon tipoPokemon = TipoPokemon.valueOf(tipo);
		return pokemonRepository.getPokemonByTipo(tipoPokemon);
	}
	public List<Pokemon> getPokemonByGeracao(int geracao){
		return pokemonRepository.getPokemonByGeracao(geracao);
	}
}
