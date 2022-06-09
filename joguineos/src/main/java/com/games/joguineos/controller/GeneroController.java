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

import com.games.joguineos.model.Genero;
import com.games.joguineos.repository.GeneroRepository;

@RestController

@CrossOrigin(origins = "*")

@RequestMapping("/generos")
public class GeneroController 
{
 @Autowired
 private GeneroRepository repository;
 
 @GetMapping
 public ResponseEntity<List<Genero>> GetAll()
 {
	 return ResponseEntity.ok(repository.findAll());
 }
 
 @GetMapping("/{id}")
 public ResponseEntity<Genero> GetAllId(@PathVariable Long id)
 {
	 return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
			 .orElse(ResponseEntity.notFound().build());
 }
 
 @PostMapping
 public ResponseEntity<Genero> postCategoria(@Valid @RequestBody Genero categoria)
 {
	 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
 }
 
 @PutMapping
 public ResponseEntity<Genero> putCategoria(@Valid @RequestBody Genero categoria)
 {
	 return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
 }
 
 
 @DeleteMapping("/{id}")
   void delete(@PathVariable Long id)
   {
	 repository.deleteById(id);
   }
}
