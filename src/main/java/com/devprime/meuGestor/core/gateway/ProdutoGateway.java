package com.devprime.meuGestor.core.gateway;

import com.devprime.meuGestor.core.entities.Produto;

import java.util.Optional;

public interface ProdutoGateway {


    Produto criarProduto (Produto produto);
    Produto atualizarProduto (long id);
    Produto deletarProduto (long id);
    Produto buscarPorId (long id);
    Optional<Produto> buscarPorNome(String nome);

}
