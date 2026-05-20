package com.gesttack.gesttackbackend.entity;

import java.sql.Timestamp;
import java.util.UUID;

public class Estoque {
    private UUID id;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private Timestamp ultimaMovimentacao;

    public Estoque( UUID id, Integer estoqueMinimo, Integer estoqueMaximo ) {
        this.id = id;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.ultimaMovimentacao = new Timestamp(System.currentTimeMillis());
    }

}
