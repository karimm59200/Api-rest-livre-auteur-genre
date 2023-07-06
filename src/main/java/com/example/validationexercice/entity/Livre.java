package com.example.validationexercice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Le titre ne peut pas être null")
    @Max(value = 50, message = "Le titre ne peut pas dépasser 50 caractères")
    private String titre;


    @Max( value = 2023, message = "L'année de publication ne peut pas être supérieur à 2023")
    private int anneeDePublication;

    @ManyToOne
    @JoinColumn(name = "autheur_id")
    @NotNull(message = "L'autheur ne peut pas être null")
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @NotNull(message = "Le genre ne peut pas être null")
    private Genre genre;

}
