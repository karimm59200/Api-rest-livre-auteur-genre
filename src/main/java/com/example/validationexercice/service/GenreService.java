package com.example.validationexercice.service;

import com.example.validationexercice.entity.Genre;
import com.example.validationexercice.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public boolean save(Genre genre){
        genreRepository.save(genre);
        return true;
    }

    public boolean findById(Integer id){
        genreRepository.findById(id);
        return true;
    }

    public List<Genre> findAll(){
       genreRepository.findAll();
         return (List<Genre>) genreRepository.findAll();

    }

    public boolean deleteById(Integer id){
        genreRepository.deleteById(id);
        return true;
    }

    public boolean updateById(Integer id, Genre genre){

        Optional<Genre> genre1 = genreRepository.findById(id);

        if(genre1.isPresent()){
            Genre genre2 = genre1.get();
            genre2.setNom(genre.getNom());
            genreRepository.save(genre2);
            return true;
        }

        genreRepository.save(genre);
        return true;
    }


}
