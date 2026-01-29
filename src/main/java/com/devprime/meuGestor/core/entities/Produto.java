package com.devprime.meuGestor.core.entities;


public class Produto {

    private Long id;
    private String nome;
    private Categoria categoria;
    Integer quantidade;
    private double precoVenda;
    private Integer quantidadeMin;


    public Produto(Long id, String nome, Categoria categoria, Integer quantidade, double precoVenda, Integer quantidadeMin) {

        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome obrigatório");

        if (precoVenda <=0)
            throw new IllegalArgumentException("Preço inválido");

        if (quantidadeMin < 0)
            throw new IllegalArgumentException("Quantidade mínima inválida");

        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.quantidadeMin = quantidadeMin;
    }


    public void adicionarEstoque(Integer qtd){
        if(qtd<= 0) throw new RuntimeException("Quantidade deve ser positiva");
        this.quantidade += qtd;

    }

    public void removerEstoque(Integer qtd){
        if(qtd<= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
        this.quantidade -= qtd;

        if(qtd > this.quantidade) throw new IllegalArgumentException("Estoque insuficiente");

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidadeMin() {
        return quantidadeMin;
    }

    public void setQuantidadeMin(Integer quantidadeMin) {
        this.quantidadeMin = quantidadeMin;
    }
}




