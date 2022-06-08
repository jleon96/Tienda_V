/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.personas;

import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author lyonc
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")

    public String index(Model model) {
        List<personas> ListaPersonas = personaService.getAllPersonas();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", ListaPersonas);
        return "personas";

    }

}
