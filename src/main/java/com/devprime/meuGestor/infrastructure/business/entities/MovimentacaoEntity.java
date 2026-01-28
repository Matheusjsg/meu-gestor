package com.devprime.meuGestor.infrastructure.business.entities;


import com.devprime.meuGestor.infrastructure.business.dtos.TipoMovimentacao;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_movimentacao")
public class MovimentacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate dataMovimentacao = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao movimentacao;

    private Integer quantidade;



    public MovimentacaoEntity() {
    }

    public MovimentacaoEntity(long id, LocalDate dataMovimentacao, TipoMovimentacao movimentacao, Integer quantidade) {
        this.id = id;
        this.dataMovimentacao = dataMovimentacao;
        this.movimentacao = movimentacao;
        this.quantidade = quantidade;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public TipoMovimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(TipoMovimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
