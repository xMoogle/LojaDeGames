package com.games.joguineos.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.games.joguineos.model.Genero;


@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> 
 {
	public List<Genero> findAllByDescricaoContainingIgnoreCase (String descricao);
 }
