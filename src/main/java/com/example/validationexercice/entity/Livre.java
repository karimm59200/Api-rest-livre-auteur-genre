package com.example.validationexercice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Column (name = "id")
    private int id;


    @Size(max = 50, message = "Le titre ne peut pas dépasser 50 caractères")
    @Column(name = "titre", nullable = false)
    private String titre;


    @Max(value = 2023, message = "L'année de publication ne peut pas être supérieur à 2023")
    @Column(name = "annee_de_publication", nullable = false)
    private int anneeDePublication;

    @ManyToOne (fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

}
