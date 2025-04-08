package com.desafio.creditos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.desafio.creditos.kafka.KafkaPublisher;
import com.desafio.creditos.model.Credito;
import com.desafio.creditos.repository.CreditoRepository;

@Service
public class CreditoService {

	@Autowired
	private CreditoRepository repository;
	
	@Autowired
	private KafkaPublisherService kafkaPublisherService;


	public List<Credito> buscarPorNfse(String nfse) {
		kafkaPublisherService.publicarConsulta("Consulta por NFSe: " + nfse);
		return repository.findByNumeroNfse(nfse);
	}

	public Credito buscarPorCredito(String numeroCredito) {
		kafkaPublisherService.publicarConsulta("Consulta por Crédito: " + numeroCredito);
		return repository.findByNumeroCredito(numeroCredito);
	}
}
