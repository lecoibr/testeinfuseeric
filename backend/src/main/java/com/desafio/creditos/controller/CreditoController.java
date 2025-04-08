package com.desafio.creditos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.creditos.model.Credito;
import com.desafio.creditos.service.CreditoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/creditos")
@Slf4j
public class CreditoController {
	
	@Autowired
	private CreditoService creditoService;


	@GetMapping("/{numeroNfse}")
	public List<Credito> buscarPorNfse(@PathVariable String numeroNfse) {
		log.info("*** buscarPorNfse: " + numeroNfse);
		return creditoService.buscarPorNfse(numeroNfse);
	}

	@GetMapping("/credito/{numeroCredito}")
	public Credito buscarPorCredito(@PathVariable String numeroCredito) {
		log.info("*** buscarPorCredito: " + numeroCredito);
		return creditoService.buscarPorCredito(numeroCredito);
	}
}
