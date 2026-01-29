package com.devprime.meuGestor.infrastructure.dtos.request;

import com.devprime.meuGestor.core.entities.Categoria;
import jakarta.validation.constraints.NotBlank;


public record ProdutoCreateRequest(

        @NotBlank String nome,
        Categoria categoria,
        Integer quantidade,
        double precoVenda,
        Integer quantidadeMin

) {
}
