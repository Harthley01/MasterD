package br.com.fiap.challenge.resource;

import br.com.fiap.challenge.dto.request.FinanceiroRequest;
import br.com.fiap.challenge.dto.response.FinanceiroResponse;
import br.com.fiap.challenge.service.FinanceiroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/financeiros")
@RequiredArgsConstructor
public class FinanceiroResource {

    private final FinanceiroService financeiroService;

    @PostMapping
    public ResponseEntity<FinanceiroResponse> createFinanceiro(@Valid @RequestBody FinanceiroRequest request) {
        FinanceiroResponse response = financeiroService.createFinanceiro(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinanceiroResponse> getFinanceiroById(@PathVariable Long id) {
        FinanceiroResponse response = financeiroService.getFinanceiroById(id);
        return ResponseEntity.ok(response);
    }
}
