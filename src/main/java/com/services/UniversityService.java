package com.services;

import com.entities.UniversityEntity;
import com.exception.UserNotFoundException;
import com.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public UniversityEntity addUniversity(UniversityEntity university){
        university.setUniversityCode(UUID.randomUUID().toString());
        return universityRepository.save(university);
    }

    public List<UniversityEntity> findAllUniversity(){
        return universityRepository.findAll();
    }

    public UniversityEntity findUniversityById(Long id){
        // This is exception handling ( Vamos lançar esta exeção no caso do nosso optional não encontrar o id)
        return universityRepository.findUniversityEntityById(id).orElseThrow(()-> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public UniversityEntity updateUniversity(UniversityEntity university){
        return universityRepository.save(university);
    }

    public void deleteUniversity(UniversityEntity university){
        universityRepository.delete(university);
    }

    public Optional<UniversityEntity> findById(Long id) {
        return universityRepository.findById(id);
    }
}
