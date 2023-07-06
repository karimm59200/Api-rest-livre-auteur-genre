package com.example.validationexercice.controller;

import com.example.validationexercice.entity.Livre;
import com.example.validationexercice.service.LivreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/livre")
public class LivreController {

    @Autowired
    LivreService livreService;

    @PostMapping ("/save-livre")
    public ResponseEntity<String> saveLivre(@Valid @RequestBody Livre livre){
        livreService.save(livre);
        return ResponseEntity.ok("Livre crée");
    }







}
