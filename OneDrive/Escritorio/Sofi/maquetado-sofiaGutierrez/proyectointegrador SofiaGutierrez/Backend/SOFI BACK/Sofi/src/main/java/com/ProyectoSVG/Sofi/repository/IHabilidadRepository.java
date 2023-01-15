package com.ProyectoSVG.Sofi.repository;
import com.ProyectoSVG.Sofi.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository <Habilidad, Long>{
    
    
}
