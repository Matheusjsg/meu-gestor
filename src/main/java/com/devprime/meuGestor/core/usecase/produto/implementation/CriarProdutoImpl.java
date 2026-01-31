package com.devprime.meuGestor.core.usecase.produto.implementation;

import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.exceptions.ProdutoJaCadastradoException;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;
import com.devprime.meuGestor.core.usecase.produto.usecase.CriarProdutoUsecase;

public class CriarProdutoImpl implements CriarProdutoUsecase {

    private final ProdutoGateway produtoGateway;

    public CriarProdutoImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public Produto execute(Produto produto) {

        produtoGateway.buscarPorNome(produto.getNome())
                .ifPresent(p -> {
                    throw new ProdutoJaCadastradoException(produto.getNome());
                });

        return produtoGateway.salvar(produto);
    }
}
