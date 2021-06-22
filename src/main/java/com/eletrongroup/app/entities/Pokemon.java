package com.eletrongroup.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.eletrongroup.app.enums.TipoPokemon;

@Entity
@Table(name = "pokemon")

public class Pokemon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7890723884825664028L;
	
	private Long id;
	private String nome;
	private int geracao;
	private TipoPokemon tipo;
	private String prevolution;
	private String evolution;
	
	@ManyToMany(mappedBy = "pokemons")
	private List<Treinador> treinadores;
	
	@Column(name="is_lendario")
	private boolean isLendario = false;
	
	public Pokemon(){
		
	}
	public Pokemon(String nome, int geracao, TipoPokemon tipo, String prevolution, String evolution, boolean isLendario) {
		this.nome = nome;
		this.geracao = geracao;
		this.tipo = tipo;
		this.prevolution = prevolution;
		this.evolution = evolution;
		this.isLendario = isLendario;	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public boolean getIsLendario() {
		return isLendario;
	}
	public void setIsLendario(boolean isLendario) {
		this.isLendario = isLendario;
	}
	
}