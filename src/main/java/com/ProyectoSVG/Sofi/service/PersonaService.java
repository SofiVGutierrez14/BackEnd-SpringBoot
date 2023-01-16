
package com.ProyectoSVG.Sofi.service;

import com.ProyectoSVG.Sofi.entity.Persona;
import com.ProyectoSVG.Sofi.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
   public IPersonaRepository persoRepo;   
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
        
    }

    @Override
    public void savePersona(Persona perso) {
        
     persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
        
    }

 @Override
    public Persona findPersona(Long id) {
     Persona persona = persoRepo.findById(id).orElse(null);
     return persona;
        
    }
        
   

 
    

    
}
