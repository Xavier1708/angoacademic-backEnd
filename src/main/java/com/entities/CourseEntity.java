package com.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_COURSE")
public class CourseEntity implements Serializable {
    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true, length = 160)
    private String courseName;

    public CourseEntity(long id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public CourseEntity() {
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return serialVersionUID == that.serialVersionUID && id == that.id && Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUID, id, courseName);
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "serialVersionUID=" + serialVersionUID +
                ", id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
