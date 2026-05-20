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
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModoPreparo() {
        return modoPreparo;
    }
    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }
    public Integer getTempoPreparo() {
        return tempoPreparo;
    }
    public void setTempoPreparo(Integer tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public List<ReceitaIngrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<ReceitaIngrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    }
