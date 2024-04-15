package br.com.fiap.challenge.service;

import br.com.fiap.challenge.dto.request.LoginRequest;
import br.com.fiap.challenge.dto.response.LoginResponse;
import br.com.fiap.challenge.entity.Login;
import br.com.fiap.challenge.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginResponse createLogin(LoginRequest request) {
        validatePasswords(request.getSenha(), request.getRepetirSenha());
        validateEmails(request.getEmail(), request.getRepetirEmail());

        Login login = Login.builder()
                .email(request.getEmail())
                .senha(request.getSenha())
                .build();

        login = loginRepository.save(login);
        return mapLoginToResponse(login);
    }

    public LoginResponse getLoginById(Long id) {
        Login login = loginRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado"));
        return mapLoginToResponse(login);
    }

    private void validatePasswords(String senha, String repetirSenha) {
        if (!senha.equals(repetirSenha)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Senhas não coincidem");
        }
    }

    private void validateEmails(String email, String repetirEmail) {
        if (!email.equals(repetirEmail)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Emails não coincidem");
        }
    }

    private LoginResponse mapLoginToResponse(Login login) {
        return new LoginResponse(login.getId(), login.getEmail());
    }
}
