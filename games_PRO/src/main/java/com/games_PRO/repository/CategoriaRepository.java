package com.games_PRO.repository;

import java.util.List;
import org.springframework.data.repository.query.Param;

import com.games_PRO.model.Categoria;

public interface CategoriaRepository {
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
