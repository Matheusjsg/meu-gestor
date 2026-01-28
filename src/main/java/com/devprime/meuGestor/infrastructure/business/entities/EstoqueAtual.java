package com.devprime.meuGestor.infrastructure.business.entities;


import jakarta.persistence.*;

@Entity
@Table (name = "td_estoque_atual")
public class EstoqueAtual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @MapsId
    @JoinColumn(name= "produto_id")
    private ProdutoEntity produto;

    private int quantidade;


    public EstoqueAtual() {
    }

    public EstoqueAtual(long id, ProdutoEntity produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
