package br.com.fiap.challenge.service;

import br.com.fiap.challenge.dto.request.CadastroRequest;
import br.com.fiap.challenge.dto.response.CadastroResponse;
import br.com.fiap.challenge.dto.response.EnderecoResponse;
import br.com.fiap.challenge.dto.response.FinanceiroResponse;
import br.com.fiap.challenge.dto.response.LoginResponse;
import br.com.fiap.challenge.entity.Cadastro;
import br.com.fiap.challenge.repository.CadastroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    public CadastroResponse createCadastro(CadastroRequest request) {
        Cadastro cadastro = mapCadastroRequestToEntity(request);
        cadastro = cadastroRepository.save(cadastro);
        return mapCadastroToResponse(cadastro);
    }

    public CadastroResponse getCadastroById(Long id) {
        Cadastro cadastro = cadastroRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cadastro não encontrado"));
        return mapCadastroToResponse(cadastro);
    }

    private Cadastro mapCadastroRequestToEntity(CadastroRequest request) {
        return Cadastro.builder()
                .nome(request.getNome())
                .sobrenome(request.getSobrenome())
                .sexo(request.getSexo())
                .cpf(request.getCpf())
                .celular(request.getCelular())
                .dataNascimento(request.getDataNascimento())
                .email(request.getEmail())
                .build();
    }

    private CadastroResponse mapCadastroToResponse(Cadastro cadastro) {
        return new CadastroResponse(
                cadastro.getId(),
                cadastro.getNome(),
                cadastro.getSobrenome(),
                cadastro.getSexo(),
                cadastro.getCpf(),
                cadastro.getCelular(),
                cadastro.getDataNascimento(),
                cadastro.getEmail(),
                cadastro.getEndereco() != null ? new EnderecoResponse(cadastro.getEndereco().getId(), cadastro.getEndereco().getEndereco(), cadastro.getEndereco().getCep(), cadastro.getEndereco().getComplemento()) : null,
                cadastro.getLogin() != null ? new LoginResponse(cadastro.getLogin().getId(), cadastro.getLogin().getEmail()) : null,
                cadastro.getFinanceiro() != null ? new FinanceiroResponse(cadastro.getFinanceiro().getId(), cadastro.getFinanceiro().getRendaMensal(), cadastro.getFinanceiro().getFonteRenda(), cadastro.getFinanceiro().getTipoEmprego(), cadastro.getFinanceiro().getInfoContaBancaria(), cadastro.getFinanceiro().getHistoricoEmprestimo(), cadastro.getFinanceiro().getHistoricoPagamento()) : null
        );
    }
}
