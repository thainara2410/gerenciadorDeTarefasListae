package br.com.listae.model;

import java.util.Date;

public class BuilderTask {


	private String nome;
	
	private String descricao;
	
	private Date dataInicio;
	
	private Date dataTermino;
	
	private String completo;

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public String getCompleto() {
		return completo;
	}
	
	public BuilderTask setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public BuilderTask setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public BuilderTask setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
		return this;
	}

	public BuilderTask setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
		return this;
	}

	public BuilderTask setCompleto(String completo) {
		this.completo = completo;
		return this;
	}
	
	public Task build() {
		return new Task(this);
	}
	
}
