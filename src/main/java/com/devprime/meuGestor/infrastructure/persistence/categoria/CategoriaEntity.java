package com.devprime.meuGestor.infrastructure.persistence.categoria;


import jakarta.persistence.*;

@Entity
@Table (name = "categoria_tb")
public class CategoriaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
}
