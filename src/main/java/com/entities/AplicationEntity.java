package com.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_APLICATION")
public class AplicationEntity implements Serializable {
    private final long serialVersionUID = 1L;

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
    @JoinColumn(name = "REGISTRATIONDATE_ID")
    private LocalDateTime registrationDate;

    @ManyToOne
    @JoinColumn(name = "COURSE1_ID")
    private CourseEntity optionCourse1;

    @ManyToOne
    @JoinColumn(name = "COURSE2_ID")
    private CourseEntity optionCourse2;
}
