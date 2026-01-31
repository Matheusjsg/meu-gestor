package com.devprime.meuGestor.core.usecase.categoria.findyBy.implementation;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.gateway.CategoriaGateway;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;
import com.devprime.meuGestor.core.usecase.categoria.findyBy.usecase.BuscarCategIdusecase;

public class BuscarCategImpl implements BuscarCategIdusecase {

    private final CategoriaGateway categoriaGateway;

    public BuscarCategImpl(CategoriaGateway categoriaGateway) {
        this.categoriaGateway = categoriaGateway;
    }


    @Override
    public Categoria excecute(long id) {
        return categoriaGateway.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
    }
}
