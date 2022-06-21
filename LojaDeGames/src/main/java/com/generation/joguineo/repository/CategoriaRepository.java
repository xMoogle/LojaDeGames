package com.generation.joguineo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.joguineo.model.Categoria;

//indicando que a camada é do tipo repository
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByGeneroContainingIgnoreCase (String genero);
}
