package com.devprime.meuGestor.infrastructure.gateway;

import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;

import com.devprime.meuGestor.infrastructure.mapper.produto.ProdutoEntityMapper;
import com.devprime.meuGestor.infrastructure.persistence.produto.ProdutoEntity;
import com.devprime.meuGestor.infrastructure.persistence.produto.ProdutoRepository;
import org.springframework.stereotype.Component;
import java.util.Optional;


@Component
public class ProdutoRepositoryGateway implements ProdutoGateway {


    ProdutoEntityMapper produtoEntityMapper;
    ProdutoRepository produtoRepository;
    
    public ProdutoRepositoryGateway(ProdutoEntityMapper produtoEntityMapper, ProdutoRepository produtoRepository) {
        this.produtoEntityMapper = produtoEntityMapper;
        this.produtoRepository = produtoRepository;
        
    }

    @Override
    public Produto salvar(Produto produto) {
        ProdutoEntity criado = produtoRepository.save(produtoEntityMapper.toEntity(produto));

        return produtoEntityMapper.toDomain(criado);
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
                .map(produtoEntityMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

            return Optional.of(busca);
    }

    @Override
    public Optional<Produto> buscarPorNome(String nome) {
        var pesquisado = produtoRepository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Nome não encontrado"));

                        return Optional.of(pesquisado);
    }
}
