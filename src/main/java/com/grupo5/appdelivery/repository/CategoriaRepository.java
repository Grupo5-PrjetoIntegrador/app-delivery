package com.grupo5.appdelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.grupo5.appdelivery.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List <Categoria> findaAllByNome(@Param("nome") String nome);

}
