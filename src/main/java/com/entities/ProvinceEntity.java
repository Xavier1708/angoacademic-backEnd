package com.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PROVINCE")
public class ProvinceEntity implements Serializable {
    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true, nullable = true, length = 50)
    private String name;
    @Column(nullable = false, updatable = false)
    private String provinceCode;

    public ProvinceEntity(long id, String name, String provinceCode) {
        this.id = id;
        this.name = name;
        this.provinceCode = provinceCode;
    }

    public ProvinceEntity() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}

