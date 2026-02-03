package com.devprime.meuGestor.infrastructure.gateway;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.gateway.CategoriaGateway;
import com.devprime.meuGestor.infrastructure.mapper.categoria.CategoriaMapper;
import com.devprime.meuGestor.infrastructure.persistence.categoria.CategoriaEntity;
import com.devprime.meuGestor.infrastructure.persistence.categoria.CategoriaRepository;

import java.util.Optional;

public class CategoriaRepositoryGateway implements CategoriaGateway {

    CategoriaMapper categoriaMapper;
    CategoriaRepository categoriaRepository;

    public CategoriaRepositoryGateway(CategoriaMapper categoriaMapper, CategoriaRepository categoriaRepository) {
        this.categoriaMapper = categoriaMapper;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria salvar(Categoria categoria) {
        CategoriaEntity criada = categoriaRepository.save(categoriaMapper.toEntity(categoria));

        return categoriaMapper.toDomain(criada);
    }

    @Override
    public Categoria atualizarCategoria(long id) {
        return null;
    }

    @Override
    public void deletarCategoria(long id) {

        CategoriaEntity procurado = categoriaRepository
                .findById(id).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        categoriaRepository.delete(procurado);

    }

    @Override
    public Optional<Categoria> buscarPorId(long id) {
        var busca = categoriaRepository.findById(id)
                .map(categoriaMapper ::toDomain)
                .orElseThrow( () -> new RuntimeException("Categoria não encontrado"));
        return Optional.of(busca);
    }

    @Override
    public Optional<Categoria> buscarPorNome(String nome) {

        var pesquisado = categoriaRepository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrado"));
        return Optional.of(pesquisado);
    }
}
