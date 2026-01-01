package com.example.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotNull(message = "Name is required while registering patient")
    @Size(max = 100, message = "Name is too long")
    private String name;

    @NotNull(message = "Email is required while registering patient")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Address is required while registering patient")
    private String address;

    @NotNull(message = "Date of birth is required while registering patient")
    private String dateOfBirth;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
