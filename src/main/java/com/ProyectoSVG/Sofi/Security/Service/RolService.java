package com.ProyectoSVG.Sofi.Security.Service;

import com.ProyectoSVG.Sofi.Security.Entity.Rol;
import com.ProyectoSVG.Sofi.Security.Enums.RolNombre;
import com.ProyectoSVG.Sofi.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    iRolRepository iRolRepository;
    
    public Optional <Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
