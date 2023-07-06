package com.example.validationexercice.repository;

import com.example.validationexercice.entity.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository  extends CrudRepository<Genre, Integer>{


}
