package com.games_PRO.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.games_PRO.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllBynomeJogoContainingIgnoreCase(@Param("nomeJogo") String titulo);
}
