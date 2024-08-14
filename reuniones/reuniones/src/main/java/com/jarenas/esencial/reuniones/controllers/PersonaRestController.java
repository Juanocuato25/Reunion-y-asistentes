package com.jarenas.esencial.reuniones.controllers;

import com.jarenas.esencial.reuniones.models.Persona;
import com.jarenas.esencial.reuniones.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;


    @GetMapping
    public ResponseEntity<List<Persona>> listaPersona(){
        return ResponseEntity.ok(personaService.listadoDePersonas());
    }
}
