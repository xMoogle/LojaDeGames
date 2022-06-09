package com.games.joguineos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.games.joguineos.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>
{

}
