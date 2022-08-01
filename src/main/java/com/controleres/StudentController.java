package com.controleres;


import com.dtos.StudentDTO;
import com.dtos.StudentInsertDTO;
import com.entities.StudentEntity;
import com.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentDTO>> getallStudent(){
        List<StudentDTO> list = service.findAllStudent();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/find/{id}")
    public StudentDTO getOneStudent(@PathVariable Long id){
       return service.findStudentById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentInsertDTO dto){
        StudentDTO newDto = service.addStudent(dto);
        return new ResponseEntity<>(newDto,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity student){
        StudentEntity update = service.updateStudent(student);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Long id){
        Optional<StudentEntity> opst = service.findById(id);
        service.deleteStudent(opst.get());
        return ResponseEntity.status(HttpStatus.OK).body("Student delete successfully");
    }
}
