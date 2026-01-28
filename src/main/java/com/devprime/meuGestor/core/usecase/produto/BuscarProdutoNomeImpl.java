package com.devprime.meuGestor.core.usecase.produto;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.exceptions.NomeNaoEncontradoException;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;

import java.util.Optional;

public class BuscarProdutoNomeImpl implements BuscarProdutoNomeUsecase{

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoNomeImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;

    }

    @Override
    public Produto execute(String nome) {
        return produtoGateway.buscarPorNome(nome)
                .orElseThrow(() -> new NomeNaoEncontradoException(nome));

    }


}
