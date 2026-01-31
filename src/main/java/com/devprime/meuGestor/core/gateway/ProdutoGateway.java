package com.devprime.meuGestor.core.gateway;

import com.devprime.meuGestor.core.entities.Produto;

import java.util.Optional;

public interface ProdutoGateway {


    Produto salvar(Produto produto);
    Produto atualizarProduto (long id);
    void deletarProduto (long id);
    Optional<Produto> buscarPorId (long id);
    Optional<Produto> buscarPorNome(String nome);

}
