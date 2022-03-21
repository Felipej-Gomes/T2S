package com.felipe.conteiner.consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.conteiner.consulta.model.Conteiner;
import com.felipe.conteiner.consulta.repository.ConteinerRepository;

@RestController
@RequestMapping("/conteiner")
public class ConteinerController {
	
	@Autowired
	private ConteinerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Conteiner>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//@GetMapping("/cliente{cliente}")
	//public ResponseEntity<List<Conteiner>> GetByCliente(@PathVariable  String cliente){
		//return ResponseEntity.ok(repository.findAllByClienteContainIgnoreCase(cliente));
	//}
	
	@PostMapping
	public ResponseEntity<Conteiner> post(@RequestBody Conteiner conteiner){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(conteiner));
	}
	
	@PutMapping
	public ResponseEntity<Conteiner> put(@RequestBody Conteiner conteiner){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(conteiner));
	
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
