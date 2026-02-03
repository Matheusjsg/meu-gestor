package com.devprime.meuGestor.infrastructure.mapper.produto;


import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.infrastructure.mapper.categoria.CategoriaMapper;
import com.devprime.meuGestor.infrastructure.persistence.produto.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoEntityMapper {

    private final CategoriaMapper categoriaMapper;

    public ProdutoEntityMapper(CategoriaMapper categoriaMapper) {
        this.categoriaMapper = categoriaMapper;
    }

    public Produto toDomain(ProdutoEntity produto) {
        return new Produto(
                produto.getId(),
                produto.getNome(),
                categoriaMapper.toDomain(produto.getCategoria()),
                produto.getQuantidade(),
                produto.getPrecoVenda(),
                produto.getQuantidadeMinima()

        );
    }

    public ProdutoEntity toEntity(Produto produtoDto) {

        return new ProdutoEntity(
                produtoDto.getNome(),
                categoriaMapper.toEntity(produtoDto.getCategoria()),
                produtoDto.getQuantidade(),
                produtoDto.getPrecoVenda(),
                produtoDto.getQuantidadeMin()

        );

    }

}