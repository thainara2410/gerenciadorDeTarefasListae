package br.com.listae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.listae.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	//listar User
	List<User> findAll();
	
	//cadastrar/atualizar novo usuario
	User save(User usuario);
	
	//deletar conta
	void delete(User usuario);
	
	//filtrar usuario
	User findByNome(String nome);

}
