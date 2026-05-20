package com.gesttack.gesttackbackend.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Ingrediente {
    private UUID id;
    private String nome;
    private String descricao;
    private Integer quantidadeEstoque;
    private String unidadeMedida;
    private Boolean perecivel;
    private LocalDate validade;
    private Boolean ativo;


    public Ingrediente( UUID id, String nome,String descricao, Integer quantidadeEstoque, String unidadeMedida, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.unidadeMedida = unidadeMedida;
        this.perecivel = perecivel;
        this.validade = LocalDate.now();
        this.ativo = ativo;

    }

}
