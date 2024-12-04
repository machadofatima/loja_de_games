package com.generation.gamestation.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id // define que o atributo será a PK (primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // A Anotação @GeneratedValue indica que a Chave Primária será gerada pelo Banco de dados. O parâmetro strategy indica de que forma esta Chave Primária será gerada. A Estratégia GenerationType.IDENTITY indica que a Chave Primária será gerada pelo Banco de dados através da opção auto-incremento (auto-increment) do SQL, que gera uma sequência numérica iniciando em 1.
    private Long id;

    @OneToMany(mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    private List<Produto> produto;


}
