package com.tienda.service;

import com.tienda.entity.personas;
import java.util.List;

/**
 *
 * @author lyonc
 */
public interface IPersonaService {

    public List<personas> getAllPersonas();

    public personas getPersonaById(Long id);

  /*  public personas FindByNombre(String nombre);*/

    public void savePersona(personas personas);

    public void delete(long id);
}
