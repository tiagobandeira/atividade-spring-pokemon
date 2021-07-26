package com.eletrongroup.app.dtos;

import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.enums.TipoPokemon;

public class PokemonDTO {
    private String nome;

    private int geracao;

    private TipoPokemon tipo;

    private String prevolution;

    private String evolution;

    private boolean isLendario;

    public Pokemon converterParaPokemon() {
        return new Pokemon(nome, geracao, tipo, prevolution, evolution, isLendario);
    }

}
