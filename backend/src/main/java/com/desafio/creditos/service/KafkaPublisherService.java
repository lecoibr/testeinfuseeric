package com.desafio.creditos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaPublisherService {

    private static final String TOPICO_CONSULTAS = "consultas-credito";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publicarConsulta(String mensagem) {
    	log.info("** Enviando para o Kafka: " + mensagem);
        kafkaTemplate.send(TOPICO_CONSULTAS, mensagem);
    }
}
