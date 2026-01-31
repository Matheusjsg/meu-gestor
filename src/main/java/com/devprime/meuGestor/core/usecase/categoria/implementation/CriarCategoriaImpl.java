package com.devprime.meuGestor.core.usecase.categoria.implementation;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.gateway.CategoriaGateway;
import com.devprime.meuGestor.core.usecase.categoria.usecase.CriarCategoriausecase;

public class CriarCategoriaImpl implements CriarCategoriausecase {

    private CategoriaGateway categoriaGateway;

    public CriarCategoriaImpl(CategoriaGateway categoriaGateway) {
        this.categoriaGateway = categoriaGateway;
    }


    @Override
    public Categoria execute(Categoria categoria) {

        categoriaGateway.buscarPorNome(categoria.nome())
                .ifPresent(c -> {throw new RuntimeException("Categoria existente");} );

        return categoriaGateway.salvar(categoria);
    }
}
