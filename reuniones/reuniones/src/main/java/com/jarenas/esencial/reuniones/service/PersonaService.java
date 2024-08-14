package com.jarenas.esencial.reuniones.service;

import com.jarenas.esencial.reuniones.models.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listadoDePersonas();

    Persona obtenerPorId(Long id);
}
