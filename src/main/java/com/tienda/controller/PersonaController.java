/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.pais;
import com.tienda.entity.personas;
import com.tienda.service.IPaisesService;

import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author lyonc
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPaisesService PaisesService;

    @GetMapping("/personas")
    public String index(Model model) {
        List<personas> ListaPersonas = personaService.getAllPersonas();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", ListaPersonas);
        return "personas";

    }

    /*Metodo para crear una persona*/
    @GetMapping("/personasN")
    public String crearPersona(Model model) {
        List<pais> listaPaises = PaisesService.listCountry();
        model.addAttribute("personas", new personas());
        model.addAttribute("paises", listaPaises);
        return "crear";

    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute personas personas) {
        personaService.savePersona(personas);
        return "redirect:/personas";

    }

    /*Metodo editar persona*/
    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        personas persona = personaService.getPersonaById(idPersona);
        List<pais> listaPaises = PaisesService.listCountry();
        model.addAttribute("personas", persona);
        model.addAttribute("paises", listaPaises);
        return "crear";

    }

    /*Metodo borrar persona*/
    @GetMapping("/deletePersona/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
        personaService.delete(idPersona);
        return "redirect:/personas";

    }
}
