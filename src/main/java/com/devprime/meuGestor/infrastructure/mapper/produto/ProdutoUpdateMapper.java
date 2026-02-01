package com.devprime.meuGestor.infrastructure.mapper.produto;


import com.devprime.meuGestor.core.entities.Produto;

import com.devprime.meuGestor.infrastructure.dtos.request.ProdutoUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class ProdutoUpdateMapper {


    public ProdutoUpdateRequest toDto(Produto produto){
        return new ProdutoUpdateRequest(
                produto.getNome(),
                produto.getCategoria(),
                produto.getQuantidade(),
                produto.getPrecoVenda(),
                produto.getQuantidadeMin()
        );
    }

    public Produto merge(Produto produtoExistente, ProdutoUpdateRequest updateRequest){

        return new Produto(
                produtoExistente.getId(),
                updateRequest.nome() != null ? updateRequest.nome() : produtoExistente.getNome(),
                updateRequest.categoria() !=null ? updateRequest.categoria() : produtoExistente.getCategoria(),
                updateRequest.quantidade() != null ? updateRequest.quantidade() : produtoExistente.getQuantidade(),
                updateRequest.precoVenda() != null ? updateRequest.precoVenda() : produtoExistente.getPrecoVenda(),
                updateRequest.quantidadeMin() !=null ? updateRequest.quantidadeMin() : produtoExistente.getQuantidadeMin()

        );
    }
    public Produto toEntity(ProdutoUpdateRequest produtoUpdateRequest) {

        return new Produto(
                null,
                produtoUpdateRequest.nome(),
                produtoUpdateRequest.categoria(),
                produtoUpdateRequest.quantidade(),
                produtoUpdateRequest.precoVenda(),
                produtoUpdateRequest.quantidadeMin()
        );
    }

}
