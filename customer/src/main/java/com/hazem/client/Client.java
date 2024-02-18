package com.hazem.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    // Personal Information
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationalId;
    private String gender;

    private String address;
    private String email;
    private String phoneNumber;


    private boolean isActive; // Client account status
    private LocalDateTime registrationDate;

    private Integer accountId;
    private Integer agencyId;

}
