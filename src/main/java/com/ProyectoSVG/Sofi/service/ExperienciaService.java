package com.ProyectoSVG.Sofi.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ProyectoSVG.Sofi.entity.Experiencia;
import com.ProyectoSVG.Sofi.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public  class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public IExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
         return expeRepo.findAll();
    }

    @Override
    public Experiencia saveExperiencia(Experiencia expe) {
         return expeRepo.save(expe);
    }

   
    
    
      @Override
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
   
}






  

   

    

 

   
   

   
    

