package com.services;


import com.entities.ApplicationEntity;
import com.repositories.AplicationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Service
public class ApplicationService {

    private final AplicationRepository repository;

    public ApplicationService(AplicationRepository repository) {
        this.repository = repository;
    }

    public ApplicationEntity addApplication(ApplicationEntity application){
        application.setApplicationCode(UUID.randomUUID().toString());
        application.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return repository.save(application);
    }
}
