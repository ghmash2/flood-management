package com.example.flood_manager.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CRISIS")
public class Crisis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String crisisDescription;

    @Column(name = "LOCATION")
    private String crisisLocation;

    @Column(name = "STATUS")
    private Boolean crisisStatus;
}
