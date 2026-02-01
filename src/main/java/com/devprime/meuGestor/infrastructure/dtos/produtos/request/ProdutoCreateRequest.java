package com.devprime.meuGestor.infrastructure.dtos.produtos.request;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.infrastructure.persistence.categoria.CategoriaEntity;
import jakarta.validation.constraints.NotBlank;


public record ProdutoCreateRequest(

        @NotBlank String nome,
        Categoria categoria,
        Integer quantidade,
        double precoVenda,
        Integer quantidadeMin

) {
}
