package com.devprime.meuGestor.infrastructure.persistence;

import com.devprime.meuGestor.core.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
