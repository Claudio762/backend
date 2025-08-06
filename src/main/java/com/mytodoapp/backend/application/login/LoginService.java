package com.mytodoapp.backend.application.login;

import com.mytodoapp.backend.domain.signup.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final AccountRepository repo;

    public LoginService(AccountRepository repo) {
        this.repo = repo;
    }

    public boolean login(String username, String password) {
        return repo.findByUsername(username)
                   .map(acc -> acc.getPassword().equals(password))
                   .orElse(false);
    }
}
