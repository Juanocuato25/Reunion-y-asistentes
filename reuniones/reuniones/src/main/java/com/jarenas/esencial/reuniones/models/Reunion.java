package com.jarenas.esencial.reuniones.models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Reunion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String asunto;
    private LocalDate fecha;

    @ManyToMany
    @JoinTable(name="asistentes",
        joinColumns = {@JoinColumn(name="reunion_id")},
        inverseJoinColumns = {@JoinColumn(name="persona_id")})
    private List<Persona> asistentes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Persona> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Persona> asistentes) {
        this.asistentes = asistentes;
    }

    public void agregarAsistente(Persona asistente){
        asistentes.add(asistente);
    }

    @Override
    public String toString() {
        return "Reunion{" +
                "id=" + id +
                ", asunto='" + asunto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
