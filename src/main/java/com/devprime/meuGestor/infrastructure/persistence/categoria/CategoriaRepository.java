package com.devprime.meuGestor.infrastructure.persistence.categoria;


import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.entities.Produto;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

    Optional<Categoria> findByNome(String nome);
}
