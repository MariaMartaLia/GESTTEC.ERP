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
}
