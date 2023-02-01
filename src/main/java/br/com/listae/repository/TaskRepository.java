package br.com.listae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.listae.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{
	//cadastrar/atualizar tarefa
	Task save(Task tarefa);
	
	//excluir tarefa
	void delete(Task tarefa);
	
	//buscar tarefas
	List<Task> findByNome(String nome);

}
