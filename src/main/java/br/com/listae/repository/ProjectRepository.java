package br.com.listae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.listae.model.Project;
import br.com.listae.model.Task;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
	//Exibir tarefas do projeto com o id do parametro
	List<Task> findById(int id_projeto);
	
	//Excluir projeto
	void delete(Project projeto);
	
	//Cadastrar/Alterar projetos
	Project save(Project projeto);
	

}
