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


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;
    }
    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    }
