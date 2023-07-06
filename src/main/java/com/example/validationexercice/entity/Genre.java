package com.example.validationexercice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotNull(message = "Le nom ne peut pas être null")
    @Size(max = 10, message = "Le nom ne peut pas dépasser 10 caractères")
    private String nom;

    @OneToMany(mappedBy = "genre")
    @Size(max = 200, message = "Le nombre de caracère ne peut pas dépasser 200")
    private List<Livre> livres;
}
