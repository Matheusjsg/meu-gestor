package com.devprime.meuGestor.infrastructure.dtos.produtos.request;

import com.devprime.meuGestor.core.entities.Categoria;

public record ProdutoUpdateRequest(

        String nome,
        Categoria categoria,
        Integer quantidade,
        Double precoVenda,
        Integer quantidadeMin

) {
}
