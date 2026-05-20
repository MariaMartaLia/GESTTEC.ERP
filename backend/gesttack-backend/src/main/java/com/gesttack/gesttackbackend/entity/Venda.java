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
}
