package br.com.fiap.challenge.resource;

import br.com.fiap.challenge.dto.request.LoginRequest;
import br.com.fiap.challenge.dto.response.LoginResponse;
import br.com.fiap.challenge.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class LoginResource {

    private final LoginService loginService;

    @PostMapping("/create")
    public ResponseEntity<LoginResponse> createLogin(@RequestBody LoginRequest request) {
        LoginResponse loginResponse = loginService.createLogin(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(loginResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoginResponse> getLoginById(@PathVariable Long id) {
        LoginResponse loginResponse = loginService.getLoginById(id);
        return ResponseEntity.ok(loginResponse);
    }
}
