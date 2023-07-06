package com.example.validationexercice.service;

import com.example.validationexercice.entity.Auteur;
import com.example.validationexercice.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public boolean save(Auteur auteur){
        auteurRepository.save(auteur);
        return true;
    }

    public Optional<Auteur>findById(Integer id){
       return   auteurRepository.findById(id);

    }

    public List<Auteur> findAll(){
        return (List<Auteur>) auteurRepository.findAll();
    }

    public boolean deleteById(Integer id){
        if(auteurRepository.existsById(id)){
            auteurRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean updateById(Integer id, Auteur auteur){

        Optional<Auteur> auteur1 = auteurRepository.findById(id);

        if(auteur1.isPresent()){
            Auteur auteur2 = auteur1.get();
            auteur2.setNom(auteur.getNom());
            auteur2.setPrenom(auteur.getPrenom());
            auteur2.setEmail(auteur.getEmail());
            auteurRepository.save(auteur2);
            return true;
        }
        return false;
    }


}
