package com.pilaniya.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "user_name")
    private  String userName;

    @Column(name = "email")
    private String email;
}
