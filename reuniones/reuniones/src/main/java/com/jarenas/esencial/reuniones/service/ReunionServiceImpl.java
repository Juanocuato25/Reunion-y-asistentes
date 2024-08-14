package com.jarenas.esencial.reuniones.service;

import com.jarenas.esencial.reuniones.models.Persona;
import com.jarenas.esencial.reuniones.models.Reunion;
import com.jarenas.esencial.reuniones.repository.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionServiceImpl implements ReunionService{

    @Autowired
    ReunionRepository reunionRepository;

    @Override
    public List<Reunion> listaReuniones() {
        List<Reunion> reuniones = reunionRepository.findAll();
        return reuniones;
    }

    @Override
    public Reunion buscarReunionPorId(Long id) {
        return reunionRepository.findById(id).get();
    }

    @Override
    public Reunion agregarAsistente(Long reunion_id, List<Persona> asistentes) {
        return null;
    }
}
