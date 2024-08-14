package com.jarenas.esencial.reuniones.controllers;

import com.jarenas.esencial.reuniones.models.Reunion;
import com.jarenas.esencial.reuniones.service.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionesRestController {

    @Autowired
    private ReunionService reunionService;

    @GetMapping
    public ResponseEntity<List<Reunion>> ListaReuniones(){
        return ResponseEntity.ok(reunionService.listaReuniones());
    }

}
