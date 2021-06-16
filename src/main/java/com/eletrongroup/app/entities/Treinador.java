package com.eletrongroup.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "treinador")
public class Treinador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -11891671776602233L;
	
	private Long id;
	private String nome;
	@Column(name="data_nascimento")
	private Date dataNascimento;
	@Column(name="inicial")
	private int inicial;
	@Column(name="comeco_como_treinador")
	private Date comecoComoTreinador;
	
	public Treinador() {
		
	}
	public Treinador(String nome, Date dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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
	
	public int getInicial() {
		return inicial;
	}
	public void setInicial(int inicial) {
		this.inicial = inicial;
	}
	public Date getComecoComoTreinaor() {
		return comecoComoTreinador;
	}
	public void setComecoComoTreinaor(Date comecoComoTreinaor) {
		this.comecoComoTreinador = comecoComoTreinaor;
	}
}