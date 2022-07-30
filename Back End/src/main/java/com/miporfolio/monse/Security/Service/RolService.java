
package com.miporfolio.monse.Security.Service;

import com.miporfolio.monse.Security.Enums.Entity.Rol;
import com.miporfolio.monse.Security.Enums.RolNombre;
import com.miporfolio.monse.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
     @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
    irolRepository.save(rol);
    }
}
