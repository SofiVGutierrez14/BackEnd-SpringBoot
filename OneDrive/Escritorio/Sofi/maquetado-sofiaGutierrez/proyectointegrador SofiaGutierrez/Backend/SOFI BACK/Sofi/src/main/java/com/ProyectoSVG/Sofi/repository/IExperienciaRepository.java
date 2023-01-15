package com.ProyectoSVG.Sofi.repository;

import com.ProyectoSVG.Sofi.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Integer> {


}