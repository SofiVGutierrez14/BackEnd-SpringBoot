
package com.ProyectoSVG.Sofi.service;

import com.ProyectoSVG.Sofi.entity.Persona;
import java.util.List;




public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public void editarPersona (Persona perso);
    
    public Persona findPersona (Long id);

 
    
   
    
}
