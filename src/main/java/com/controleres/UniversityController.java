package com.controleres;


import com.entities.UniversityEntity;
import com.services.UniversityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/univercidade")
public class UniversityController {
    private final UniversityService universityService;
    public UniversityController(UniversityService universityService){
        this.universityService = universityService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<UniversityEntity>> getAllUniversity(){
        List<UniversityEntity> university = universityService.findAllUniversity();
        return new ResponseEntity<>(university, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<UniversityEntity> getUniversityById(@PathVariable("id") Long id){
        UniversityEntity university = universityService.findUniversityById(id);
        return new ResponseEntity<>(university, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<UniversityEntity> addUniversity(@RequestBody UniversityEntity university){
        UniversityEntity newUniversity = universityService.addUniversity(university);
        return new ResponseEntity<>(newUniversity, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UniversityEntity> updateUniversity(@RequestBody UniversityEntity university){
        UniversityEntity updateUniversity = universityService.updateUniversity(university);
        return new ResponseEntity<>(updateUniversity, HttpStatus.OK);
    }


     @DeleteMapping("/delete/{id}")
         public ResponseEntity<Object> deleteUniversity(@PathVariable(value = "id") Long id){
          Optional<UniversityEntity> optionalUniversity = universityService.findById(id);
          universityService.deleteUniversity(optionalUniversity.get());
          return  ResponseEntity.status(HttpStatus.OK).body("University delete successfully");
    }



}
