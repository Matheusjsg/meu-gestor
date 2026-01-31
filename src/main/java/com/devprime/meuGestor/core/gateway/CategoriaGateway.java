package com.devprime.meuGestor.core.gateway;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.entities.Produto;

import java.util.Optional;

public interface CategoriaGateway {
    Categoria salvar(Categoria categoria);
    Categoria atualizarCategoria (long id);
    void deletarCategoria(long id);
    Optional<Categoria> buscarPorId (long id);
    Optional<Categoria> buscarPorNome(String nome);

}
