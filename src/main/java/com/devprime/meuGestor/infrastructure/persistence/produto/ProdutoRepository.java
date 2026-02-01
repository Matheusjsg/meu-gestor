package com.devprime.meuGestor.infrastructure.persistence.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    Optional<Object> findByName(String nome);
}
