package com.jarenas.esencial.reuniones.async;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jarenas.esencial.reuniones.models.Persona;
import com.jarenas.esencial.reuniones.models.Reunion;
import com.jarenas.esencial.reuniones.service.PersonaService;
import com.jarenas.esencial.reuniones.service.ReunionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BuscaListener {

    private static final Logger LOG = LoggerFactory.getLogger(BuscaListener.class);

     private final ObjectMapper mapper;
     private final PersonaService personaService;
     private final ReunionService reunionService;


    public BuscaListener(ObjectMapper mapper, PersonaService personaService, ReunionService reunionService) {
        this.mapper = mapper;
        this.personaService = personaService;
        this.reunionService = reunionService;
    }

    public void recibirMensaje(String mensaje){
        try{
            InfoBusca info = mapper.readValue(mensaje, InfoBusca.class);
            Persona persona = personaService.obtenerPorId(info.getIdAsistente());
            Reunion reunion = reunionService.buscarReunionPorId(info.getIdReunion());
            LOG.info("{} {} tiene una reunion a las {}", persona.getNombre(), persona.getApellidos(), reunion.getFecha());
        }catch (JsonProcessingException e){
            LOG.warn("Mensaje incorrecto", e);
        }
    }
}
