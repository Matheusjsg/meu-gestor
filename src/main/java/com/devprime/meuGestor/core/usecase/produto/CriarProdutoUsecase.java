package com.devprime.meuGestor.core.usecase.produto;

import com.devprime.meuGestor.core.entities.Produto;

import java.util.Optional;

public interface CriarProdutoUsecase {

    Produto execute(Produto produto);

}