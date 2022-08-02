
package com.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_UNIVERSITY")
public class UniversityEntity implements Serializable {
    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true, length = 160)
    private String email;

    @Column(nullable = true, unique = true, length = 20)
    private int phone;

    @Column(nullable = false, updatable = false)
    private String universityCode;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;

    public UniversityEntity(long id, String name, String email, int phone, String universityCode, ProvinceEntity province) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.universityCode = universityCode;
        this.province = province;
    }

    public UniversityEntity() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUniversityCode() {
        return universityCode;
    }

    public void setUniversityCode(String universityCode) {
        this.universityCode = universityCode;
    }

    public ProvinceEntity getProvince() {
        return province;
    }

    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityEntity that = (UniversityEntity) o;
        return serialVersionUID == that.serialVersionUID && id == that.id && phone == that.phone && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(universityCode, that.universityCode) && Objects.equals(province, that.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUID, id, name, email, phone, universityCode, province);
    }

    @Override
    public String toString() {
        return "UniversityEntity{" +
                "serialVersionUID=" + serialVersionUID +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", universityCode='" + universityCode + '\'' +
                ", province=" + province +
                '}';
    }
}
