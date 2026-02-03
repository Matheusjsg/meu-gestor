package com.devprime.meuGestor.infrastructure.persistence.produto;

import com.devprime.meuGestor.core.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    Optional<Produto> findByNome(String nome);
}
