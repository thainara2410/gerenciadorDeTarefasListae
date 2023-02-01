package br.com.listae.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;
	
	private String nome;
	
	private String senha;
	
	User(BuilderUser Usuario){
		this.nome = Usuario.getNome();
		this.senha = Usuario.getSenha();
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
}
