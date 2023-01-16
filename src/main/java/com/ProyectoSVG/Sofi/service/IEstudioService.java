
package com.ProyectoSVG.Sofi.service;

import com.ProyectoSVG.Sofi.entity.Estudio;
import java.util.List;




public interface IEstudioService {
    
    
    public List<Estudio> verEstudios();
    
    public void crearEstudio (Estudio estu);
    
    public void borrarEstudio (Long id);
    
    public void editarEstudio (Estudio est);
    
    public Estudio buscarEstudio (Long id);
}
