package com.example.flood_manager.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DONATION")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String donatorName;

    @Column(name = "CONTACT")
    private String donatorContact;

    @Column(name = "Time")
    private String donationTime;

    @Column(name = "AMOUNT")
    private Double donationAmount;
}
