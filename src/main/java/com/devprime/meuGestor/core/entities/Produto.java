package com.devprime.meuGestor.core.entities;


public class Produto {

    private long id;
    private String nome;
    private Categoria categoriaid;
    Integer quantidade;
    private double precoVenda;
    private Integer quantidadeMin;


    public Produto(long id, String nome, Categoria categoriaid, Integer quantidade, double precoVenda, Integer quantidadeMin) {

        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome obrigatório");

        if (precoVenda <=0)
            throw new IllegalArgumentException("Preço inválido");

        if (quantidadeMin < 0)
            throw new IllegalArgumentException("Quantidade mínima inválida");

        this.id = id;
        this.nome = nome;
        this.categoriaid = categoriaid;
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

    public Categoria getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Categoria categoriaid) {
        this.categoriaid = categoriaid;
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




