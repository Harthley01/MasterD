package br.com.fiap.challenge.resource;

import br.com.fiap.challenge.dto.request.CadastroRequest;
import br.com.fiap.challenge.dto.response.CadastroResponse;
import br.com.fiap.challenge.service.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastros")
@RequiredArgsConstructor
public class CadastroResource {

    private final CadastroService cadastroService;

    @PostMapping
    public ResponseEntity<CadastroResponse> createCadastro(@RequestBody CadastroRequest request) {
        CadastroResponse response = cadastroService.createCadastro(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroResponse> getCadastroById(@PathVariable Long id) {
        CadastroResponse response = cadastroService.getCadastroById(id);
        return ResponseEntity.ok(response);
    }
}
