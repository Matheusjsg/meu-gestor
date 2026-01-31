package com.devprime.meuGestor.core.usecase.produto.implementation;

import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;
import com.devprime.meuGestor.core.usecase.produto.usecase.DeletarProdutoUsecase;

public class DeletarProdutoImpl implements DeletarProdutoUsecase {

    private final ProdutoGateway produtoGateway;

    public DeletarProdutoImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public void execute(long id) {

        var produto = produtoGateway.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Produtonão encontrado"));


        produtoGateway.deletarProduto(produto.getId());

    }
}