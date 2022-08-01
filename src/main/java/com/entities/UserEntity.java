package com.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_USER")
public class UserEntity implements Serializable {
    private final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique = true, length = 50)
    private String username;
    @Column(nullable = false, unique = true, length = 50)
    private String password;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    @Column(nullable = false, updatable = false)
    private String userCode;
}
