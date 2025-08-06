package com.mytodoapp.backend.infrastructure.login;

import com.mytodoapp.backend.domain.login.LoginRequest;
import com.mytodoapp.backend.application.login.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {
    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        boolean success = service.login(request.username, request.password);
        if (success) {
            return ResponseEntity.ok("Login riuscito");
        } else {
            return ResponseEntity.status(401).body("Credenziali errate");
        }
    }
}
