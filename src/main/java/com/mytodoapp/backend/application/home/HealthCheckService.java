package com.mytodoapp.backend.application.home;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {
    public String check() {
        return "Backend attivo";
    }
}
