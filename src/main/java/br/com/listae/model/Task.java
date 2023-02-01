package br.com.listae.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private Date dataInicio;
	
	private Date dataTermino;
	
	private String completo;
	
	private Integer id_proj;
	
	
	Task(BuilderTask Tarefa){
		this.nome = Tarefa.getNome();
		this.descricao = Tarefa.getDescricao();
		this.completo = Tarefa.getCompleto();
		this.dataInicio = Tarefa.getDataInicio();
		this.dataTermino = Tarefa.getDataTermino();
	}
	
	public Integer getId() {
		return id;
	}

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

	
	

}
