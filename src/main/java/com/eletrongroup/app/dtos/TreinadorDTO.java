package com.eletrongroup.app.dtos;

import java.util.Date;

import com.eletrongroup.app.entities.Treinador;

public class TreinadorDTO {
	
	private String nome;
	private Date dataNascimento;
	
	public Treinador converterParaTreinador() {
		return new Treinador(nome, dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
