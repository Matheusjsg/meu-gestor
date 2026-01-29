package com.devprime.meuGestor.infrastructure.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_entradas")
public class EntradaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private long fornecedor_id;

    private final LocalDate dataEntrada = LocalDate.now();

    //organizar forma de como será a relação com img (mesma entidade para nota fiscal / img produtos)
    private List<ImagensEntity> imgNotaFiscal = new ArrayList<>();
    //organizar forma de como será a relação com img (mesma entidade para nota fiscal / img produtos)

    @OneToMany(mappedBy = "tb_entradas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EntradaItensEntity> itens = new ArrayList<>();


    public EntradaEntity() {
    }

    public EntradaEntity(long id, List<ImagensEntity> imgNotaFiscal, long fornecedor_id) {
        this.id = id;
        this.imgNotaFiscal = imgNotaFiscal;
        this.fornecedor_id = fornecedor_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(long fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public List<ImagensEntity> getImgNotaFiscal() {
        return imgNotaFiscal;
    }

    public void setImgNotaFiscal(List<ImagensEntity> imgNotaFiscal) {
        this.imgNotaFiscal = imgNotaFiscal;
    }
}
