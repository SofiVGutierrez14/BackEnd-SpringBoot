package com.ProyectoSVG.Sofi.repository;
import com.ProyectoSVG.Sofi.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository <Estudio, Long>{
    
}
