package com.ProyectoSVG.Sofi.service;
import com.ProyectoSVG.Sofi.entity.Habilidad;
import java.util.List;


public interface IHabilidadService {
     public List<Habilidad> verHabilidades();
    
    public void crearHabilidad (Habilidad hab);
    
    public void borrarHabilidad (Long id);
    
    public Habilidad buscarHabilidad (Long id);
}
