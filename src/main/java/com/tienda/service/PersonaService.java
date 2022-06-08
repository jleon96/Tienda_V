package com.tienda.service;

import com.tienda.entity.personas;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    
    @Override
    public List<personas> getAllPersonas() {
        return (List<personas>)personaRepository.findAll();
    }

    @Override
    public personas getPersonaById(Long id) {
       return personaRepository.findById(id).orElse(null);
    }


    @Override
    public void savePersona(personas personas) {
        personaRepository.save(personas);
    }

    @Override
    public void delete(long id) {
       personaRepository.deleteById(id);
    }
     /*   @Override
    public personas FindByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/

    
}
