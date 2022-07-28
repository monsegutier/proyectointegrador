
package com.miporfolio.monse.Interface;

import com.miporfolio.monse.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    /*traer una lista de personas*/
    public List<Persona> getPersona();
    /*Guardar un objeto tipo persona    */
    public void savePersona(Persona persona);
    /*Eliminar un usuario*/
    public void deletePersona(Long id);
    /*Buscar una persona*/
    public Persona findPersona(Long id);
  }
