package com.devprime.meuGestor.core.entities;


public class Produto {

    private long id;
    private String nome;
    private int categoriaid;
    Integer quantidade;
    private double precoVenda;
    private Integer quantidadeMin;

    public Produto() {}

    public Produto(long id, String nome, int categoriaid, Integer quantidade, double precoVenda, Integer quantidadeMin) {

        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome obrigatório");

        if (precoVenda <=0)
            throw new IllegalArgumentException("Preço inválido");

        this.id = id;
        this.nome = nome;
        this.categoriaid = categoriaid;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.quantidadeMin = quantidadeMin;
    }



}




