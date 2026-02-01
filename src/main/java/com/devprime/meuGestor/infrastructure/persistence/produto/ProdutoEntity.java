package com.devprime.meuGestor.infrastructure.persistence.produto;


import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.infrastructure.persistence.categoria.CategoriaEntity;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_produtos")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;

    @Column(name = "quantidade")
    private int quantidade;

    private double precoVenda;

    @Column(name = "quantidade_minima")
    private int quantidadeMinima;

    public ProdutoEntity() {
    }

    public ProdutoEntity(String nome, CategoriaEntity categoria, int quantidade, double precoVenda, int quantidadeMinima) {

        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.quantidadeMinima = quantidadeMinima;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
}

