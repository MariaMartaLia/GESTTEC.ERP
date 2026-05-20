package com.gesttack.gesttackbackend.entity;

import java.util.UUID;

public class Tipo {
    private UUID id;
    private String nome;
    private String descricao;

    public Tipo(UUID id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
