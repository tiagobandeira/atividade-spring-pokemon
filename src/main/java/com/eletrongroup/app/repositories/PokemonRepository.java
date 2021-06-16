package com.eletrongroup.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eletrongroup.app.entities.Pokemon;

@Repository
public interface PokemonRepository extends CrudRepository <Pokemon, Long> {

}
