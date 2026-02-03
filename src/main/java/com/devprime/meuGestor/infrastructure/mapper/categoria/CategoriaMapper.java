package com.devprime.meuGestor.infrastructure.mapper.categoria;


import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.infrastructure.persistence.categoria.CategoriaEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {


    public Categoria toDomain(CategoriaEntity categoriaEntity){
        if (categoriaEntity == null) return null;
        return new Categoria(
                categoriaEntity.getId(),
                categoriaEntity.getNome());
    }
public CategoriaEntity toEntity(Categoria categoria){

        if (categoria == null) return null;

    return new CategoriaEntity(
                        categoria.nome());
}

}
