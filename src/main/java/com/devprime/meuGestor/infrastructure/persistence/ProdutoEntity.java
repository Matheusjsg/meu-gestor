package com.devprime.meuGestor.infrastructure.persistence;


import com.devprime.meuGestor.core.entities.Categoria;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name= "tb_produtos")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @Column(name = "quantidade")
    private int quantidade;

    private BigDecimal precoVenda;

    @Column(name = "quantidade_minima")
    private int quantidadeMinima;


    public ProdutoEntity() {
    }

    public ProdutoEntity(String nome, long id, Categoria categoria, int quantidade, BigDecimal precoVenda, int quantidadeMinima) {
        this.nome = nome;
        this.id = id;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.quantidadeMinima = quantidadeMinima;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
}
