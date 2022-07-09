package com.tienda.service;

import com.tienda.entity.pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisesService implements IPaisesService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<pais> listCountry() {
       return (List<pais>)paisRepository.findAll();
    }
}


/*
    
  
    public List<pais> getAllPersonas() {
        return (List<pais>)paisRepository.findAll();
    }

    public pais getPersonaById(Long id) {
       return paisRepository.findById(id).orElse(null);
    }


    public void savePersona(pais pais) {
        paisRepository.save(pais);
    }

*/