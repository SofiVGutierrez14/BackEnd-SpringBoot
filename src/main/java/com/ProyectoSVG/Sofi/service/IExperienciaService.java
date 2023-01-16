package com.ProyectoSVG.Sofi.service;

import com.ProyectoSVG.Sofi.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    
    public Experiencia saveExperiencia(Experiencia expe);
    
    public void borrarExperiencia(int id);
 
    
    
    
 
}
