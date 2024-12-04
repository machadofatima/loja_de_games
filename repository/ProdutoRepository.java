package com.generation.gamestation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.gamestation.model.Produto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

    public List<Produto> findAllByPlataformaContainingIgnoreCase(@Param("plataforma") String plataforma);






}
