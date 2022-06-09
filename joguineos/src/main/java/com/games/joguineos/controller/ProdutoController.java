package com.games.joguineos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.joguineos.model.Produto;
import com.games.joguineos.repository.ProdutoRepository;

@RestController

@CrossOrigin(origins= "*")

@RequestMapping("/produto")
public class ProdutoController 
{
@Autowired ProdutoRepository repository;

@GetMapping
public ResponseEntity<List<Produto>> GetAll()
{
	return ResponseEntity.ok(repository.findAll());
}
@GetMapping("/{id}")
public ResponseEntity<Produto> GetAllId(@PathVariable Long id)
{
	 return repository.findById(id)
			 .map(resposta -> ResponseEntity.ok(resposta))
	 .orElse(ResponseEntity.notFound().build());
}

@PostMapping
public ResponseEntity<Produto> jogoo(@Valid @RequestBody Produto produto)
{
	  return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
}

@PutMapping
public ResponseEntity<Produto> putjogo(@Valid @RequestBody Produto produto)
{
	  return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
}
@DeleteMapping("/{id}")
void delete(@PathVariable Long id)
{
	 repository.deleteById(id);
}
}

