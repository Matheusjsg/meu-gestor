package com.devprime.meuGestor.core.usecase.produto.findyBy.usecase;

import com.devprime.meuGestor.core.entities.Produto;


public interface BuscarProdutoNomeUsecase {

    Produto execute (String nome);
}
