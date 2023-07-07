package com.example.validationexercice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false)
    @Size(max = 50, message = "Le nom ne peut pas dépasser 50 caractères")
    private String nom;

    private String prenom;

    @Column(name = "email", nullable = false)
    @Email( regexp = "^[A-Za-z0-9]+@editor.com", message = "L'email doit être de la forme @editor.com" )
    private String email;

    @OneToMany(mappedBy = "auteur" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Livre> livres;


}
