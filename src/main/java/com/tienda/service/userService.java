package com.tienda.service;

import com.tienda.entity.personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author lyonc
 */
@Service
public class userService implements UserDetailsService { //UserDetailsService si afecta al spring security, y valida los datos del usuario para poder ingresar

    
    @Autowired
    public IPersonaService personaService;
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //loadUserByUsername carga un usuario por su nombre de usaurio
        personas persona  = this.personaService.findByNombre(username);
        userPrincipal Userprincipal = new userPrincipal(persona);
        return Userprincipal;
    }
    
}
