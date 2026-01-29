package com.devprime.meuGestor.infrastructure.mapper;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.infrastructure.dtos.response.ProdutoResponse;
import org.springframework.stereotype.Component;

@Component
public class ProdutoResponseMapper {

    public ProdutoResponse toDto(Produto produto){
        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getQuantidade(),
                produto.getPrecoVenda(),
                produto.getQuantidadeMin()

                );
    }
    public Produto toEntity(ProdutoResponse produtoResponse){
        return new Produto(
                produtoResponse.id(),
                produtoResponse.nome(),
                produtoResponse.categoria(),
                produtoResponse.quantidade(),
                produtoResponse.precoVenda(),
                produtoResponse.quantidadeMin()
                );
    }

}
