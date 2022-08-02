package com.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_STUDENT")
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String date_of_brith;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;
    private String gender;
    private int phone;
    private String personal_identification;
    @Column(nullable = false,unique = true, updatable = false)
    private String passwordAcces;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public StudentEntity(long id, String first_name, String last_name, String email, String date_of_brith, ProvinceEntity province, String gender, int phone, String personal_identification, String passwordAcces, String studentCode) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date_of_brith = date_of_brith;
        this.province = province;
        this.gender = gender;
        this.phone = phone;
        this.personal_identification = personal_identification;
        this.passwordAcces = passwordAcces;
        this.studentCode = studentCode;
    }

    public StudentEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_of_brith() {
        return date_of_brith;
    }

    public void setDate_of_brith(String date_of_brith) {
        this.date_of_brith = date_of_brith;
    }

    public ProvinceEntity getProvince() {
        return province;
    }

    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPersonal_identification() {
        return personal_identification;
    }

    public void setPersonal_identification(String personal_identification) {
        this.personal_identification = personal_identification;
    }

    public String getPasswordAcces() {
        return passwordAcces;
    }

    public void setPasswordAcces(String passwordAcces) {
        this.passwordAcces = passwordAcces;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
