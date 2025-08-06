package com.mytodoapp.backend.application.signup;


import com.mytodoapp.backend.domain.signup.Account;
import com.mytodoapp.backend.domain.signup.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    private final AccountRepository repo;

    public SignupService(AccountRepository repo) {
        this.repo = repo;
    }

    public boolean signup(Account account) {
        if (repo.existsByUsername(account.getUsername())) {
            return false;
        }
        repo.save(account);
        return true;
    }
}

