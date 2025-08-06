package com.mytodoapp.backend.infrastructure.signup;

import com.mytodoapp.backend.domain.signup.Account;
import com.mytodoapp.backend.application.signup.SignupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")
@CrossOrigin(origins = "*")
public class SignupController {
    private final SignupService service;

    public SignupController(SignupService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody Account account) {
        boolean success = service.signup(account);
        if (success) {
            return ResponseEntity.ok("Account creato");
        } else {
            return ResponseEntity.status(409).body("Username già esistente");
        }
    }
}
