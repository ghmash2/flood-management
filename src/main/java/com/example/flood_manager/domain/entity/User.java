package com.example.flood_manager.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String userName;

    @Column(name = "CONTACT")
    private String userContact;

    @Column(name = "EMAIL")
    private String userEmail;

    @Column(name = "PASSWORD")
    private String userPassword;

    @Column(name = "ROLE")
    private String userRole;
}
