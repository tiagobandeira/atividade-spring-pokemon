package com.eletrongroup.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class Treinador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -11891671776602233L;
	
	private Long id;
	private String nome;
	private Date dataNascimento;
	private List <Pokemon> pokemons;
	private Pokemon inicial;
	private Date comecoComoTreinaor;
	
	public Treinador() {
		
	}
	public Treinador(String nome, Date dataNascimento, Pokemon inicial){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.inicial = inicial;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	public Pokemon getInicial() {
		return inicial;
	}
	public void setInicial(Pokemon inicial) {
		this.inicial = inicial;
	}
	public Date getComecoComoTreinaor() {
		return comecoComoTreinaor;
	}
	public void setComecoComoTreinaor(Date comecoComoTreinaor) {
		this.comecoComoTreinaor = comecoComoTreinaor;
	}
}