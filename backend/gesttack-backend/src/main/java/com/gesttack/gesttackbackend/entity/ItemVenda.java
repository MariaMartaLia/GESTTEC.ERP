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

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public BigDecimal getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto (Produto produto) {
        this.produto = produto;
    }

}
