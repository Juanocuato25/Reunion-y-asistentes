package com.jarenas.esencial.reuniones.service;

import com.jarenas.esencial.reuniones.models.Persona;
import com.jarenas.esencial.reuniones.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> listadoDePersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).get();
    }
}
