package br.com.listae.model;

public class BuilderUser {
	
	private String nome;
	
	private String senha;
	
	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public BuilderUser setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public BuilderUser setSenha(String senha) {
		this.senha = senha;
		return this;
	}
	
	public User build() {
		return new User(this);
	}

}
