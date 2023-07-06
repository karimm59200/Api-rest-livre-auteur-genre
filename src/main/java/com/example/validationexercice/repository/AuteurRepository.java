package com.example.validationexercice.repository;

import com.example.validationexercice.entity.Auteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository<Author> extends CrudRepository<Auteur, Integer>{



}
