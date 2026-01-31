package com.devprime.meuGestor.core.usecase.categoria.findyBy.implementation;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.exceptions.NomeNaoEncontradoException;
import com.devprime.meuGestor.core.gateway.CategoriaGateway;
import com.devprime.meuGestor.core.usecase.categoria.findyBy.usecase.BuscarCategNomeusecase;

public class BuscarCategNomeImpl implements BuscarCategNomeusecase {

    private final CategoriaGateway categoriaGateway;

    public BuscarCategNomeImpl(CategoriaGateway categoriaGateway) {
        this.categoriaGateway = categoriaGateway;
    }

    @Override
    public Categoria execute(String nome) {
        return categoriaGateway.buscarPorNome(nome).orElseThrow( () -> new NomeNaoEncontradoException(nome));
    }
}
