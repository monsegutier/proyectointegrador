
package com.miporfolio.monse.Security.Repository;

import com.miporfolio.monse.Security.Enums.Entity.Rol;
import com.miporfolio.monse.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
