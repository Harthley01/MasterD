package br.com.fiap.challenge.dto.response;

public record EnderecoResponse(
        Long id,
        String endereco,
        String cep,
        String complemento
) {}
