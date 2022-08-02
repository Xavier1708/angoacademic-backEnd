package com.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_APPLICATION")
public class ApplicationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "UNIVERSITY_ID")
    private UniversityEntity university;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private StudentEntity student;

    @Column(nullable = false)
    @JoinColumn(name = "REGISTRATION_DATE")
    private LocalDateTime registrationDate;

    @ManyToOne
    @JoinColumn(name = "COURSE1_ID")
    private CourseEntity optionCourse1;

    @ManyToOne
    @JoinColumn(name = "COURSE2_ID")
    private CourseEntity optionCourse2;

    private String ducsURL;

    @Column(nullable = false, updatable = false)
    private String applicationCode;

    public ApplicationEntity(long id, UniversityEntity university, StudentEntity student, LocalDateTime registrationDate, CourseEntity optionCourse1, CourseEntity optionCourse2, String ducsURL, String applicationCode) {
        this.id = id;
        this.university = university;
        this.student = student;
        this.registrationDate = registrationDate;
        this.optionCourse1 = optionCourse1;
        this.optionCourse2 = optionCourse2;
        this.ducsURL = ducsURL;
        this.applicationCode = applicationCode;
    }

    public ApplicationEntity() {
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
}
