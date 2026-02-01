package com.devprime.meuGestor.infrastructure.dtos.produtos.response;

import com.devprime.meuGestor.core.entities.Categoria;

public record ProdutoResponse(

        Long id,
        String nome,
        Categoria categoria,
        Integer quantidade,
        double precoVenda,
        Integer quantidadeMin
) {
}
