package com.eletrongroup.app.repositories;

import com.eletrongroup.app.enums.TipoPokemon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eletrongroup.app.entities.Pokemon;

import java.util.List;

@Repository
public interface PokemonRepository extends CrudRepository <Pokemon, Long> {
    Pokemon getPokemonById(Long id);

    @Query("SELECT p FROM Pokemon p WHERE p.tipo = :tipo")
    List<Pokemon> getPokemonByTipo(@Param("tipo") TipoPokemon tipo);

    @Query("SELECT p FROM Pokemon p WHERE p.geracao = :geracao")
    List<Pokemon> getPokemonByGeracao(@Param("geracao") int geracao);
}
