package com.gesttack.gesttackbackend.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemVenda {
    private UUID id;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal subTotal;

    private Produto produto;

    public ItemVenda( UUID id, Integer quantidade, BigDecimal precoUnitario, BigDecimal subTotal) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subTotal = subTotal;
    }
}
