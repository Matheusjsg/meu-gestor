package com.devprime.meuGestor.core.usecase.categoria.implementation;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.gateway.CategoriaGateway;
import com.devprime.meuGestor.core.usecase.categoria.usecase.DeletarCategoriausecase;

public class DeletarCategoriaImpl implements DeletarCategoriausecase {

    private final CategoriaGateway categoriaGateway;

    public DeletarCategoriaImpl(CategoriaGateway categoriaGateway) {
        this.categoriaGateway = categoriaGateway;
    }

    @Override
    public void execute(long id) {

        Categoria existente = categoriaGateway.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Houve algum erro, roduto não encontrado!"));

        categoriaGateway.deletarCategoria(existente.id());
    }
}
