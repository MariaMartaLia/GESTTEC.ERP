
package com.gesttack.gesttackbackend.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private String descricao;
    private BigDecimal precoVenda;
    private String codigoBarras;
    private Boolean ativo;
    private Boolean perecivel;
    private LocalDateTime dataCadastro;
    private String observacao;

    private Categoria categoria;
    private Marca marca;
    private Tipo tipo;
    private Estoque estoque;

    public Produto(String nome, String descricao, BigDecimal precoVenda, String codigoBarras, String observacao) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.codigoBarras = codigoBarras;
        this.ativo = true;
        this.perecivel = true;
        this.dataCadastro = LocalDateTime.now();
        this.observacao = observacao;
    }


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
    public Boolean getPerecivel() {
        return perecivel;
    }
    public void setPerecivel(Boolean perecivel) {
        this.perecivel = perecivel;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    } public Estoque getEstoque() {
        return estoque;
    }
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao( String observacao) {
        this.observacao = observacao;
    }
    public boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}