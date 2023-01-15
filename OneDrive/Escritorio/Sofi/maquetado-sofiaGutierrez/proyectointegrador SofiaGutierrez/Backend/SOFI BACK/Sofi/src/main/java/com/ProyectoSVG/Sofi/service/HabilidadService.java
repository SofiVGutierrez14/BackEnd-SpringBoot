package com.ProyectoSVG.Sofi.service;
import com.ProyectoSVG.Sofi.entity.Habilidad;
import com.ProyectoSVG.Sofi.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
   public IHabilidadRepository habiRepo;   
    
    @Override
    public List<Habilidad> verHabilidades() {
        
        return habiRepo.findAll();
        
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        
    habiRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habiRepo.findById(id).orElse(null);
    }
}
