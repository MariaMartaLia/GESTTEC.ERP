package com.gesttack.gesttackbackend.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Venda {
    private UUID id;
    private LocalDateTime dataVenda;
    private BigDecimal valorTotal;
    private Boolean status;
    private String Observacao;

    private List<ItemVenda> itens = new ArrayList<>();

    public Venda( UUID id, LocalDateTime dataVenda, BigDecimal valorTotal, Boolean status, String observacao) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.status = status;
        this.Observacao = observacao;

    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDateTime getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getObservacao() {
        return Observacao;
    }
    public void setObservacao(String observacao) {
        Observacao = observacao;
    }
    public List<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

}
