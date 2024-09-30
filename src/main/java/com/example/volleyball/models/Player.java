package com.example.volleyball.models;

import lombok.*;

@Getter
@Setter //adnotacja bo @
@NoArgsConstructor // konstruktor bezargumentowy
@AllArgsConstructor //konstruktor wszystko argumentowy
@RequiredArgsConstructor //konstror dla wymaganych argumentów

public class Player {
    @NonNull
    private int id;
    @NonNull // name nie może być nullem. Zawsze musi mieć wartść przypisaną
    private String name;
    @NonNull
    private String sureName;
    private int age;
    private int height;
    private String role;


}
