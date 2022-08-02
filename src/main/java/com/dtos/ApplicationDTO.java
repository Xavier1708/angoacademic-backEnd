package com.dtos;

import com.entities.CourseEntity;
import com.entities.StudentEntity;
import com.entities.UniversityEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
public class ApplicationDTO {


    private long id;

    private UniversityEntity university;
    private StudentEntity student;
    private LocalDateTime registrationDate;
    private CourseEntity optionCourse1;
    private CourseEntity optionCourse2;
    private String ducsURL;
    private String applicationCode;

    public ApplicationDTO(StudentEntity student, LocalDateTime registrationDate, CourseEntity optionCourse1, CourseEntity optionCourse2, String ducsURL, String applicationCode) {
        this.student = student;
        this.registrationDate = registrationDate;
        this.optionCourse1 = optionCourse1;
        this.optionCourse2 = optionCourse2;
        this.ducsURL = ducsURL;
        this.applicationCode = applicationCode;
    }

    public ApplicationDTO() {
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public CourseEntity getOptionCourse1() {
        return optionCourse1;
    }

    public void setOptionCourse1(CourseEntity optionCourse1) {
        this.optionCourse1 = optionCourse1;
    }

    public CourseEntity getOptionCourse2() {
        return optionCourse2;
    }

    public void setOptionCourse2(CourseEntity optionCourse2) {
        this.optionCourse2 = optionCourse2;
    }

    public String getDucsURL() {
        return ducsURL;
    }

    public void setDucsURL(String ducsURL) {
        this.ducsURL = ducsURL;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UniversityEntity getUniversity() {
        return university;
    }

    public void setUniversity(UniversityEntity university) {
        this.university = university;
    }
}
