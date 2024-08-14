package com.jarenas.esencial.reuniones.repository;

import com.jarenas.esencial.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
