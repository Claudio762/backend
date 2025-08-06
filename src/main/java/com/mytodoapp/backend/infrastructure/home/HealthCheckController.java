package com.mytodoapp.backend.infrastructure.home;

import com.mytodoapp.backend.application.home.HealthCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "*")
public class HealthCheckController {
    private final HealthCheckService service;

    public HealthCheckController(HealthCheckService service) {
        this.service = service;
    }

    @GetMapping("/ping")
    public String ping() {
        return service.check();
    }
}