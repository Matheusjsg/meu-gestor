package com.devprime.meuGestor.infrastructure.dtos.request;

import com.devprime.meuGestor.core.entities.Categoria;
import jakarta.validation.constraints.NotBlank;

public record ProdutoUpdateRequest(

        String nome,
        Categoria categoria,
        Integer quantidade,
        Double precoVenda,
        Integer quantidadeMin

) {
}
