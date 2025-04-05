package com.org.yuvaan.bank.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data  // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-arguments constructor
@Entity
@Table(name = "customer_personal_details", schema = "yuvaan_bank")
public class CustomerPersonalDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(name = "father_husband_name", nullable = false)
    private String fatherHusbandName;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String aadhaar;



}
