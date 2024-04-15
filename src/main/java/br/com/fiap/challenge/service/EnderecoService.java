package br.com.fiap.challenge.service;

import br.com.fiap.challenge.dto.request.EnderecoRequest;
import br.com.fiap.challenge.dto.response.EnderecoResponse;
import br.com.fiap.challenge.entity.Endereco;
import br.com.fiap.challenge.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoResponse createEndereco(EnderecoRequest request) {
        Endereco endereco = mapEnderecoRequestToEntity(request);
        endereco = enderecoRepository.save(endereco);
        return mapEnderecoToResponse(endereco);
    }

    public EnderecoResponse getEnderecoById(Long id) {
        Endereco endereco = enderecoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereço não encontrado"));
        return mapEnderecoToResponse(endereco);
    }

    private Endereco mapEnderecoRequestToEntity(EnderecoRequest request) {
        return Endereco.builder()
                .endereco(request.getEndereco())
                .cep(request.getCep())
                .complemento(request.getComplemento())
                .build();
    }

    private EnderecoResponse mapEnderecoToResponse(Endereco endereco) {
        return new EnderecoResponse(
                endereco.getId(),
                endereco.getEndereco(),
                endereco.getCep(),
                endereco.getComplemento()
        );
    }
}
