package com.repositories;


import com.entities.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UniversityRepository extends JpaRepository<UniversityEntity, Long> {

     Optional<UniversityEntity> findUniversityEntityById(Long id);
}
