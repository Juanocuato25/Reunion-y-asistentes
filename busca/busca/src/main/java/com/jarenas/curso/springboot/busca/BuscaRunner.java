package com.jarenas.curso.springboot.busca;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BuscaRunner  implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper mapper;

    @Autowired
    private ConfigurableApplicationContext context;

    public BuscaRunner(RabbitTemplate rabbitTemplate, ObjectMapper mapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.mapper = mapper;
    }

    @Override
    public void run(String... args) throws Exception {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ID de la reunion");
            Long idReunion = sc.nextLong();
            System.out.println("ID de la persona");
            Long idPersona = sc.nextLong();
            InfoBusca info = new InfoBusca();
            info.setIdAsistente(idPersona);
            info.setIdReunion(idReunion);
            rabbitTemplate.convertAndSend("servicios","reuniones.busca.personas",mapper.writeValueAsString(info));
            context.close();
        }
    }
}
