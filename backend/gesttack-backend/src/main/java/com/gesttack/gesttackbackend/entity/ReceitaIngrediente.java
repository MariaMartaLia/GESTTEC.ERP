package com.gesttack.gesttackbackend.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class ReceitaIngrediente {
    private UUID id;
    private BigDecimal quantidade;
    private String unidadeMedida;

    private Ingrediente ingrediente;

    public ReceitaIngrediente(UUID id, BigDecimal quantidade, String unidadeMedida) {
        this.id = id;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    public UUID getId() {
        return id;
    }
    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

}
