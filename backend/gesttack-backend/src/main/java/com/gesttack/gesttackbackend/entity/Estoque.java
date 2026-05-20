package com.gesttack.gesttackbackend.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

public class Estoque {
    private UUID id;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private LocalDateTime ultimaMovimentacao;

    public Estoque( UUID id, Integer estoqueMinimo, Integer estoqueMaximo ) {
        this.id = id;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.ultimaMovimentacao  = LocalDateTime.now();
    }

    public UUID getId(){
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }
    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }
    public void setEstoqueMaximo(Integer estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }
    public LocalDateTime getUltimaMovimentacao() {
        return ultimaMovimentacao;
    }
    public void setUltimaMovimentacao(LocalDateTime ultimaMovimentacao) {
        this.ultimaMovimentacao = ultimaMovimentacao;
    }
}
