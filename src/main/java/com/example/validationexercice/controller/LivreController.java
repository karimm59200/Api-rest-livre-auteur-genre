package com.example.validationexercice.controller;

import com.example.validationexercice.entity.Livre;
import com.example.validationexercice.service.LivreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class LivreController {

    @Autowired
    LivreService livreService;

    @PostMapping ("/save-livre")
    public ResponseEntity<String> saveLivre(@Valid @RequestBody Livre livre){
        livreService.save(livre);
        return ResponseEntity.ok("Livre crée");
    }

    @GetMapping("/get-livre/{id}")
    public ResponseEntity<Livre> getLivre(@RequestBody @PathVariable("id")  int id){

        return ResponseEntity.ok(livreService.findById(id));
    }

    @GetMapping("/getAll-livre")
    public ResponseEntity<List<Livre>> getAllLivre( ){

        return ResponseEntity.ok(livreService.findAll());
    }

    @PutMapping("/update-livre/{id}")
    public ResponseEntity<Livre> updateLivre(@PathVariable(name = "id") int id, @Valid   @RequestBody Livre livre){

        return ResponseEntity.ok(livreService.updateById(id, livre));
    }

    @DeleteMapping("/delete-livre/{id}")
    public ResponseEntity<String> deleteLivre( @PathVariable(name = "id") int id){
        livreService.deleteById(id);
        return ResponseEntity.ok("Livre supprimé");
    }

}
