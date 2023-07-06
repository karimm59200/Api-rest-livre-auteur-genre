package com.example.validationexercice.service;

import com.example.validationexercice.entity.Livre;
import com.example.validationexercice.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public boolean save(Livre livre){
        livreRepository.save(livre);
        return true;
    }

    public boolean findById(Integer id){
        livreRepository.findById(id);
        return true;
    }

    public List<Livre> findAll(){
        return  (List<Livre>)livreRepository.findAll();

    }

    public boolean deleteById(Integer id){
        livreRepository.deleteById(id);
        return true;
    }

    public boolean updateById(Integer id, Livre livre){
        livreRepository.save(livre);
        return true;
    }
}
