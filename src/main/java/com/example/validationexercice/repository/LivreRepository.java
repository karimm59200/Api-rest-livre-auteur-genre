package com.example.validationexercice.repository;

import com.example.validationexercice.entity.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreRepository  extends CrudRepository<Livre, Integer>{

 List<Livre> findAll();

}
