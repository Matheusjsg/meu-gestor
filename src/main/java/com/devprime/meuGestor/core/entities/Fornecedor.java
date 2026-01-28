package com.devprime.meuGestor.core.entities;

public record Fornecedor(
        long id,
        String NomeFantasia,
        String CNPJ,
        String contato,
        String email
) {
}
