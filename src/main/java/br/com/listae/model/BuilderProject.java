package br.com.listae.model;

import java.util.Date;

public class BuilderProject {
	private String nome;
	
	private String descricao;
	
	private String completo;
	
	private Date dataInicio;
	
	private Date dataTermino;
	
	private Integer nroTarefas;
	
	private Integer nroTarefasConcluidas;

	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCompleto() {
		return completo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public Integer getNroTarefas() {
		return nroTarefas;
	}

	public Integer getNroTarefasConcluidas() {
		return nroTarefasConcluidas;
	}

	public BuilderProject setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public BuilderProject setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public BuilderProject setCompleto(String completo) {
		this.completo = completo;
		return this;
	}

	public BuilderProject setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
		return this;
	}

	public BuilderProject setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
		return this;
	}

	public BuilderProject setNroTarefas(Integer nroTarefas) {
		this.nroTarefas = nroTarefas;
		return this;
	}

	public BuilderProject setNroTarefasConcluidas(Integer nroTarefasConcluidas) {
		this.nroTarefasConcluidas = nroTarefasConcluidas;
		return this;
	}
	
	public Project build() {
		return new Project(this);
	}
	
	
}

