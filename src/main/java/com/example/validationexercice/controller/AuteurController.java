package com.example.validationexercice.controller;

import com.example.validationexercice.entity.Auteur;
import com.example.validationexercice.service.AuteurService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuteurController {

    @Autowired
    AuteurService auteurService;

    @PostMapping("/save-auteur")
    ResponseEntity save(@Valid @RequestBody Auteur auteur){
        auteurService.save(auteur);
        return ResponseEntity.ok("Auteur crée");
    }

    @GetMapping ("/get-auteur/{id}")
    public ResponseEntity<?> getAuteur ( @Valid  @PathVariable (name="id") int id , @RequestBody Auteur auteur){
        auteurService.findById(id);
        return ResponseEntity.ok(auteurService.findById(id));
    }

    @GetMapping ("/getAll-auteur")
    public ResponseEntity<?> getAllAuteur (@Valid  @RequestBody Auteur auteur){
        auteurService.findAll();
        return ResponseEntity.ok(auteurService.findAll());
    }

    @PutMapping ("/update-auteur/{id}")
    public ResponseEntity<?> updateAuteur (@Valid @PathVariable (name="id") int id , @RequestBody Auteur auteur){
        auteurService.updateById(id, auteur);
        return ResponseEntity.ok(auteur);
    }

    @DeleteMapping ("/delete-auteur/{id}")
    public ResponseEntity<?> deleteAuteur (@Valid @PathVariable (name="id") int id , @RequestBody Auteur auteur){
        auteurService.deleteById(id);
        return ResponseEntity.ok(auteur);
    }








}
