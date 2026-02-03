package com.devprime.meuGestor.infrastructure.persistence.categoria;


import jakarta.persistence.*;

@Entity
@Table (name = "categoria_tb")
public class CategoriaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;


    public CategoriaEntity() {
    }

    public CategoriaEntity(String nome) {
                this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
