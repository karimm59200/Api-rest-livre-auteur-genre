package com.example.validationexercice.controller;

import com.example.validationexercice.entity.Genre;
import com.example.validationexercice.service.GenreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class GenreController {

    @Autowired
    GenreService genreService;

    @PostMapping ("/save-genre")
    ResponseEntity save(@Valid @RequestBody Genre genre){
        genreService.save(genre);
        return ResponseEntity.ok("Genre crée");
    }

    @GetMapping ("/get-genre/{id}")
    public ResponseEntity<Genre> getGenre ( @Valid  @PathVariable (name="id") int id , @RequestBody Genre genre){
        genreService.findById(id);
        return ResponseEntity.ok(genre);
    }

    @GetMapping ("/getAll-genre")
    public ResponseEntity<?> getAllGenre ( @Valid  @RequestBody Genre genre){
        genreService.findAll();
        return ResponseEntity.ok(genreService.findAll());
    }



    @PutMapping ("/update-genre/{id}")
    public ResponseEntity<Genre> updateGenre (@Valid @PathVariable (name="id") int id , @RequestBody Genre genre){
        genreService.updateById(id,genre);
        return ResponseEntity.ok(genre);
    }

    @DeleteMapping ("/delete-genre/{id}")
    public ResponseEntity<Genre> deleteGenre (@Valid @PathVariable (name="id") int id , @RequestBody Genre genre){
        genreService.deleteById(id);
        return ResponseEntity.ok(genre);
    }





}
