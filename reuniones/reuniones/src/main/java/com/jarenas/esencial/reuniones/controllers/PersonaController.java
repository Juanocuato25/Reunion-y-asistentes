package com.jarenas.esencial.reuniones.controllers;


import com.jarenas.esencial.reuniones.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping
    public String listadoPersonas(Model model){
        model.addAttribute("personas", personaService.listadoDePersonas());
        return "personas";
    }
}
