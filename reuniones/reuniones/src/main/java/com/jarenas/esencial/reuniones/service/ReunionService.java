package com.jarenas.esencial.reuniones.service;

import com.jarenas.esencial.reuniones.models.Persona;
import com.jarenas.esencial.reuniones.models.Reunion;

import java.util.List;

public interface ReunionService {

    List<Reunion> listaReuniones();

    Reunion buscarReunionPorId(Long id);

    Reunion agregarAsistente(Long reunion_id, List<Persona> asistentes);
}
