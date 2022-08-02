package com.repositories;

import com.entities.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AplicationRepository extends JpaRepository<ApplicationEntity, Long> {

}
