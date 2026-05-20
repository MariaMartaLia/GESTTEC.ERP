package com.gesttack.gesttackbackend.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Receita {
    private UUID id;
    private String nome;
    private String modoPreparo;
    private Integer tempoPreparo;
    private Boolean ativo;

    private List<ReceitaIngrediente> ingredientes = new ArrayList< >();

    public Receita(UUID id, String nome, String modoPreparo, Integer tempoPreparo, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.tempoPreparo = tempoPreparo;
        this.ativo = ativo;


    }
}
