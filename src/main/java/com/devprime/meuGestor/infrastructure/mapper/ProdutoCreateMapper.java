package com.devprime.meuGestor.infrastructure.mapper;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.infrastructure.dtos.request.ProdutoCreateRequest;
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
        public Produto toEntity(ProdutoCreateRequest produtoCreateRequest){

        return new Produto(null,
                produtoCreateRequest.nome(),
                produtoCreateRequest.categoria(),
                produtoCreateRequest.quantidade(),
                produtoCreateRequest.precoVenda(),
                produtoCreateRequest.quantidadeMin()
        );

    }

}
