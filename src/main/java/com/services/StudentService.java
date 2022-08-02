package com.services;


import com.dtos.StudentDTO;
import com.dtos.StudentInsertDTO;
import com.entities.StudentEntity;
import com.exception.UserNotFoundException;
import com.repositories.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO addStudent(StudentInsertDTO dto){
        StudentEntity student = new StudentEntity();
        BeanUtils.copyProperties(dto,student);
        student.setStudentCode(UUID.randomUUID().toString());
        student.setPasswordAcces(dto.getPasswordAcces());
        student = studentRepository.save(student);
        return new StudentDTO(student);

    }

    public StudentEntity updateStudent(StudentEntity student){
        return studentRepository.save(student);
    }
    public List<StudentDTO> findAllStudent(){
       List<StudentEntity> list = studentRepository.findAll();
       return list.stream().map(x -> new StudentDTO(x)).collect(Collectors.toList());
    }

    public StudentDTO findStudentById(Long id){
        StudentEntity student = studentRepository.findById(id).get();
        StudentDTO dto = new StudentDTO(student);
        return dto;
    }


    public void deleteStudent(StudentEntity student){
        studentRepository.delete(student);
    }

    public Optional<StudentEntity> findById(Long id) {
        return studentRepository.findById(id);
    }
}
