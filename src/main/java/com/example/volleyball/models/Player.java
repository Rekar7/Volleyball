package com.example.volleyball.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity //encja
@Getter
@Setter //adnotacja bo @
@NoArgsConstructor // konstruktor bezargumentowy
@AllArgsConstructor //konstruktor wszystko argumentowy
@RequiredArgsConstructor //konstror dla wymaganych argumentów

public class Player {
    @NonNull
    @Id
    @UuidGenerator
    private UUID id;
    @NonNull // name nie może być nullem. Zawsze musi mieć wartść przypisaną
    private String name;
    @NonNull
    private String sureName;
    private int age;
    private Boolean gender;     //0 - male, 1 - female
    private Integer height;
    private String role;


}
