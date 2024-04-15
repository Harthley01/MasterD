package br.com.fiap.challenge.resource;

import br.com.fiap.challenge.dto.request.EnderecoRequest;
import br.com.fiap.challenge.dto.response.EnderecoResponse;
import br.com.fiap.challenge.entity.Endereco;
import br.com.fiap.challenge.service.EnderecoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enderecos")
@RequiredArgsConstructor
public class EnderecoResource {

    private final EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<EnderecoResponse> createEndereco(@Valid @RequestBody EnderecoRequest request) {
        EnderecoResponse response = enderecoService.createEndereco(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoResponse> getEnderecoById(@PathVariable Long id) {
        EnderecoResponse response = enderecoService.getEnderecoById(id);
        return ResponseEntity.ok(response);
    }
}
