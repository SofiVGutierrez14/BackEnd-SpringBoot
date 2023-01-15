
package com.ProyectoSVG.Sofi.Security.Repository;

import com.ProyectoSVG.Sofi.Security.Entity.Rol;
import com.ProyectoSVG.Sofi.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
