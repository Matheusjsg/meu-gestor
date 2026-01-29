package com.devprime.meuGestor.infrastructure.entities;


import jakarta.persistence.*;

@Entity
@Table(name= "tb_imagens")
public class ImagensEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomeArquivo;


    public ImagensEntity() {
    }

    public ImagensEntity(long id, String nomeArquivo) {
        this.id = id;
        this.nomeArquivo = nomeArquivo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}
