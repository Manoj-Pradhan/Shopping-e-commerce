package com.example.jazzy_kart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, message = "Street name must contain at  least 5 characters")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Building name must contain at least 5 characters")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City name must contain at least 4 characters")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State name must contain at least 2 characters")
    private String state;

    @NotBlank
    @Size(min = 6, message = "PinCode must contain at least 6 characters")
    private String pinCode;


    @NotBlank
    @Size(min = 2, message = "Country name must contain at least 2 characters")
    private String country;

    public void setId(Long id) {
    }

    // Getters and Setters
}
