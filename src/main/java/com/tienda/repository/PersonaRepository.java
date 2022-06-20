/*
Buscar acerca de java generics
interface=
 */
package com.tienda.repository;


import com.tienda.entity.personas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author lyonc
 */


@Repository
public interface PersonaRepository extends CrudRepository<personas,Long>{
    
    
    
}
