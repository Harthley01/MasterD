package br.com.fiap.challenge.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EnderecoRequest {

    @NotBlank(message = "O atributo endereco é obrigatório")
    @NotNull(message = "O atributo endereco é obrigatório")
    private String endereco;

    @NotBlank(message = "O atributo cep é obrigatório")
    @NotNull(message = "O atributo cep é obrigatório")
    private String cep;

    private String complemento;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
