package com.gesttack.gesttackbackend.entity;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import lombok.Setter;

public class Categoria {
    private UUID id;
    private String nome;
    private String descricao;
    private List<Produto> produtos;

    public Categoria(UUID id, String nome, String descricao, List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public void setNome( String nome ){
        this.nome = nome;
    }
    public String getDescricao( ){
        return descricao;
    }
    public void setDescricao( String descricao ){
        this.descricao = descricao;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos( List<Produto> produtos ) {
        this.produtos = produtos;
    }

}