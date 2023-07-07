package com.example.validationexercice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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



    @Size(max = 10, message = "Le nom ne peut pas dépasser 10 caractères")
    @Column(name = "nom", nullable = false)
    private String nom;


    @Size(max = 200, message = "La description ne peut pas dépasser 200 caractères")
    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Livre> livres;
}
