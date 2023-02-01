package br.com.listae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.listae.model.Task;
import br.com.listae.model.User;
import br.com.listae.repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository mov;
	
	//Listar user
		@RequestMapping(value="/login", method=RequestMethod.GET)
		public @ResponseBody List<User> listar(){
			return mov.findAll();
		}
	
	//Cadastrar user
		@RequestMapping(value="/login", method=RequestMethod.POST)
		public @ResponseBody User cadastrar(@RequestBody User usuario) {
			return mov.save(usuario);
		}

}
