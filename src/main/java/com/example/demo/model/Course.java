package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    @NotBlank(message="ne peut pas être vide")
    private String id;
    @NotBlank(message="ne peut pas être vide")
    private String title;
    @Positive(message="doit être structement positif")
    private int credits;
}
