package com.devprime.meuGestor.infrastructure.business.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class FornecedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomeFantasia;

    private String CNPJ;

    private String contato;

    private String email;

    public FornecedorEntity() {
    }

    public FornecedorEntity(long id, String nomeFantasia, String CNPJ, String contato, String email) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
        this.contato = contato;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
