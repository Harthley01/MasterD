package br.com.fiap.challenge.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginRequest {

    @Email(message = "O atributo email deve ser um endereço de e-mail válido")
    @NotBlank(message = "O atributo email é obrigatório")
    @NotNull(message = "O atributo email é obrigatório")
    private String email;

    @NotBlank(message = "O atributo senha é obrigatório")
    @NotNull(message = "O atributo senha é obrigatório")
    private String senha;

    @NotBlank(message = "O atributo repetirSenha é obrigatório")
    @NotNull(message = "O atributo repetirSenha é obrigatório")
    private String repetirSenha;

    @NotBlank(message = "O atributo repetirEmail é obrigatório")
    @NotNull(message = "O atributo repetirEmail é obrigatório")
    private String repetirEmail;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getRepetirSenha() {
        return repetirSenha;
    }

    public String getRepetirEmail() {
        return repetirEmail;
    }
}
