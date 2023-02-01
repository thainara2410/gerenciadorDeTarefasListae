package br.com.listae.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProjeto;
	
	private String nome;
	
	private String descricao;
	
	private String completo;
	
	private Date dataInicio;
	
	private Date dataTermino;
	
	private Integer nroTarefas;
	
	private Integer nroTarefasConcluidas;
	
	private Integer id_usuario;
	
	Project(BuilderProject Projeto){
		this.nome = Projeto.getNome();
		this.descricao = Projeto.getDescricao();
		this.completo = Projeto.getCompleto();
		this.dataInicio = Projeto.getDataInicio();
		this.dataTermino = Projeto.getDataTermino();
		this.nroTarefas = Projeto.getNroTarefas();
		this.nroTarefasConcluidas = Projeto.getNroTarefasConcluidas();
	}

	public Integer getIdProjeto() {
		return idProjeto;
	}

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
	
	
	
}
