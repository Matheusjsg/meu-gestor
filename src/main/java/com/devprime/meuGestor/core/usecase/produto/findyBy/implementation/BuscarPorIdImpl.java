package com.devprime.meuGestor.core.usecase.produto.findyBy.implementation;

import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;
import com.devprime.meuGestor.core.usecase.produto.findyBy.usecase.BuscarPorIdusecase;

public class BuscarPorIdImpl implements BuscarPorIdusecase {

    private final ProdutoGateway produtoGateway;


    public BuscarPorIdImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }


    public Produto execute(long id){

        return produtoGateway.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    }




}

