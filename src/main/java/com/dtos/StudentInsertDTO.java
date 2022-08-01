package com.dtos;

public class StudentInsertDTO extends StudentDTO{

    private String passwordAcces;


    public StudentInsertDTO() {
        super();
    }


    public String getPasswordAcces() {
        return passwordAcces;
    }


    public void setPasswordAcces(String passwordAcces) {
        this.passwordAcces = passwordAcces;
    }
}
