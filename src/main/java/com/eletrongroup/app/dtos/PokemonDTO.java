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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isLendario() {
		return isLendario;
	}

	public void setIsLendario(boolean isLendario) {
		this.isLendario = isLendario;
	}

	public int getGeracao() {
		return geracao;
	}

	public void setGeracao(int geracao) {
		this.geracao = geracao;
	}
	public TipoPokemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public String getPrevolution() {
		return prevolution;
	}

	public void setPrevolution(String prevolution) {
		this.prevolution = prevolution;
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	
	
	
}
