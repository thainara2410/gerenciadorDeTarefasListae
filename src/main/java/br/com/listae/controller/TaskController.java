package br.com.listae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.listae.model.Task;
import br.com.listae.repository.TaskRepository;

@RestController
@RequestMapping("/api")
public class TaskController {
	
	@Autowired
	private TaskRepository acoes;
	
	//Listar tarefas
	@RequestMapping(value="/tarefas", method=RequestMethod.GET)
	public @ResponseBody List<Task> listarTask(){
		return acoes.findAll();
	}
	
	
	//Cadastrar Tarefas
	@RequestMapping(value= "/tarefas", method=RequestMethod.POST)
	public @ResponseBody Task cadastrar(@RequestBody Task tarefa) {
		return acoes.save(tarefa);
	}

}
