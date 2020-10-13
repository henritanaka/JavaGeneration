package com.minhaLogjaGames.LojaGames.controller;

import java.util.List;

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

import com.minhaLogjaGames.LojaGames.model.Categoria;
import com.minhaLogjaGames.LojaGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repositorio;
	
	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(categoria));
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable long id){
		return repositorio.findById(id).map(resp->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> findByDescricaoCategoria(@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria (@PathVariable long id) {
		repositorio.deleteById(id);
		
	}
	
}
