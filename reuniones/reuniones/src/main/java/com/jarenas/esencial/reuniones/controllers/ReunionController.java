package com.jarenas.esencial.reuniones.controllers;


import com.jarenas.esencial.reuniones.models.Reunion;
import com.jarenas.esencial.reuniones.service.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {

    @Autowired
    ReunionService reunionService;


    @GetMapping
    public String listaDeReuniones(Model model){
        model.addAttribute("reuniones", reunionService.listaReuniones());
        return "reuniones";
    }
}
