package com.devprime.meuGestor.infrastructure.gateway;

import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;

import com.devprime.meuGestor.infrastructure.mapper.EntityMapper;
import com.devprime.meuGestor.infrastructure.persistence.ProdutoEntity;
import com.devprime.meuGestor.infrastructure.persistence.ProdutoRepository;
import org.springframework.stereotype.Component;
import java.util.Optional;


@Component
public class ProdutoRepositoryGateway implements ProdutoGateway {


    EntityMapper entityMapper;
    ProdutoRepository produtoRepository;
    
    public ProdutoRepositoryGateway(EntityMapper entityMapper, ProdutoRepository produtoRepository) {
        this.entityMapper = entityMapper;
        this.produtoRepository = produtoRepository;
        
    }

    @Override
    public Produto salvar(Produto produto) {
        ProdutoEntity criado = produtoRepository.save(entityMapper.toEntity(produto));

        return entityMapper.toDomain(criado);
    }


    @Override
    public Produto atualizarProduto(long id) {

       return null;
    }

    @Override
    public void deletarProduto(long id) {
        ProdutoEntity pesquisado = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("PRODUTO NÃO ENCONTRADO"));

        produtoRepository.delete(pesquisado);

    }

    @Override
    public Optional<Produto> buscarPorId(long id) {

        var busca = produtoRepository.findById(id)
                .map(entityMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("`roduto não encontrado"));

            return Optional.of(busca);
    }

    @Override
    public Optional<Produto> buscarPorNome(String nome) {
        var pesquisado = produtoRepository.findByName(nome)
                .orElseThrow(() -> new IllegalArgumentException("Nome não encontrado"));

                        return Optional.of((Produto) pesquisado);
    }
}
