package com.devprime.meuGestor.infrastructure.mapper.produto;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.infrastructure.dtos.produtos.request.ProdutoCreateRequest;
import com.devprime.meuGestor.infrastructure.persistence.produto.ProdutoEntity;
import org.springframework.stereotype.Component;


@Component
public class ProdutoCreateMapper {

    public ProdutoCreateRequest toDto(Produto produto) {

        return new ProdutoCreateRequest(
                produto.getNome(),
                produto.getCategoria(),
                produto.getQuantidade(),
                produto.getPrecoVenda(),
                produto.getQuantidadeMin()
        );
    }
        public ProdutoEntity toEntity(Produto produtoDto){

        return new ProdutoEntity(
                produtoDto.getNome(),
                produtoDto.getCategoria(),
                produtoDto.getQuantidade(),
                produtoDto.getPrecoVenda(),
                produtoDto.getQuantidadeMin()

        );

    }

}
