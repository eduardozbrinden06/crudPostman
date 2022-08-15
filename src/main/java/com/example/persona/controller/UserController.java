package com.example.persona.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persona.entity.User;
import com.example.persona.interfaces.UserRepository;




@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	
	//INGRESO DE DATOS A LA BD
	@PostMapping("/post")
	public User add(@RequestBody User val) {
		return repo.save(val);
	}
	
	
	//MOSTRAR TODOS LOS REGISTROS
	@GetMapping("/getUser")
	public List<User> views(){
		return repo.findAll();
	}
	
	
	// MOSTRAR POR UNA ID
	@GetMapping("/getUser/{val}") 
	public Optional<User> views(@PathVariable Integer val){
		return repo.findById(val);
	}
	
	// MOSTRAR POR GENDER Y EDAD
	@GetMapping("/getUser/{e}") 
	public Optional<User> views(@PathVariable Integer e){
		return repo.findById(e);
	}
	
	//MODIFICAR POR UNA ID
	@PutMapping("/update")
	public User views(@RequestBody User val){
		return repo.save(val);
	}
	
	
	//ELIMINAR REGISTRO POR UNA ID
	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val){
	   repo.deleteById(val);
	   return "Id : " +val+ " delete";
	}

}
