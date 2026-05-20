package com.gesttack.gesttackbackend.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class MovimentacaoEstoque {
    private UUID id;
    private String tipoMovimentacao;
    private Integer quantidade;
    private LocalDateTime dataMovimentacao;
    private String observacao;

    private Produto produto;


    public MovimentacaoEstoque( UUID id, String tipoMovimentacao,Integer quantidade,LocalDateTime dataMovimentacao,String Observacao) {
        this.id = id;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataMovimentacao = dataMovimentacao;
        this.observacao = observacao;
    }
}
