package com.eletrongroup.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.entities.Treinador;

@Repository
public interface TreinadorRepository extends CrudRepository<Treinador, Long> {
	
	//public Pokemon pokemonInicial();
	//public List<Pokemon> listPokemons(Long id);
	public Treinador getTreinadorById(Long id);
	

}
