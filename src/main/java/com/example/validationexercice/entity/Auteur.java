package com.example.validationexercice.entity;

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

    @NotNull(message = "Le nom ne peut pas être null")
    @Size(max = 50, message = "Le nom ne peut pas dépasser 50 caractères")
    private String nom;

    private String prenom;

    @Email(message = "Ce n'est pas une adresse mail")
    @Pattern(regexp = "^[A-Za-z0-9]+@editor\\.com$", message = "L'email doit être de la forme @editor.com")
    private String email;

    @OneToMany(mappedBy = "auteur")
    private List<Livre> livres;


}
