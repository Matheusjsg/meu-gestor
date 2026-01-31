package com.devprime.meuGestor.infrastructure.mapper;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.infrastructure.persistence.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper {

    public Produto toDomain(ProdutoEntity produtoResponse) {
        return new Produto(
                produtoResponse.getId(),
                produtoResponse.getNome(),
                produtoResponse.getCategoria(),
                produtoResponse.getQuantidade(),
                produtoResponse.getPrecoVenda(),
                produtoResponse.getQuantidadeMinima()

        );
    }

    public ProdutoEntity toEntity(Produto produtoDto) {

        return new ProdutoEntity(
                produtoDto.getNome(),
                produtoDto.getCategoria(),
                produtoDto.getQuantidade(),
                produtoDto.getPrecoVenda(),
                produtoDto.getQuantidadeMin()

        );

    }

}