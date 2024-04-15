package br.com.fiap.challenge.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CadastroRequest {

    @NotBlank(message = "O atributo nome é obrigatório")
    @NotNull(message = "O atributo nome é obrigatório")
    private String nome;

    @NotBlank(message = "O atributo sobrenome é obrigatório")
    @NotNull(message = "O atributo sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "O atributo sexo é obrigatório")
    @NotNull(message = "O atributo sexo é obrigatório")
    private String sexo;

    @NotBlank(message = "O atributo cpf é obrigatório")
    @NotNull(message = "O atributo cpf é obrigatório")
    private String cpf;

    @NotBlank(message = "O atributo celular é obrigatório")
    @NotNull(message = "O atributo celular é obrigatório")
    private String celular;

    @NotBlank(message = "O atributo data de nascimento é obrigatório")
    @NotNull(message = "O atributo data de nascimento é obrigatório")
    private String dataNascimento;

    @Email(message = "O atributo email deve ser um endereço de e-mail válido")
    @NotBlank(message = "O atributo email é obrigatório")
    @NotNull(message = "O atributo email é obrigatório")
    private String email;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }
}
