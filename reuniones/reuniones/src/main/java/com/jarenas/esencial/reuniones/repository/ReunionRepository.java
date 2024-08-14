package com.jarenas.esencial.reuniones.repository;

import com.jarenas.esencial.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
