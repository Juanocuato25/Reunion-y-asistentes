package com.jarenas.esencial.reuniones.task;

import com.jarenas.esencial.reuniones.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DirectorioRunner implements CommandLineRunner {

    private static final Logger  LOG = LoggerFactory.getLogger(DirectorioRunner.class);


    @Autowired
    private PersonaService personaService;

    @Override
    public void run(String... args) throws Exception {
    LOG.info("Directorio de personas:");
    personaService.listadoDePersonas().forEach(persona -> {
        LOG.info(persona.toString());
    });
    }
}
