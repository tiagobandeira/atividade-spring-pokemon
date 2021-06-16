package com.eletrongroup.app.dtos;

import java.util.Date;

import com.eletrongroup.app.entities.Pokemon;
import com.eletrongroup.app.entities.Treinador;

public class TreinadorDTO {
	
	//private Long id;
	private String nome;
	private Date dataNascimento;
	//private List <Pokemon> pokemons;
	private Pokemon inicial;
	//private Date comecoComoTreinaor;
	
	public Treinador converterParaTreinador() {
		return new Treinador(nome, dataNascimento, inicial);
	}

}
