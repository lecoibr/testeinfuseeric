package com.desafio.creditos.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.desafio.creditos.model.Credito;

public class CreditoServiceTest {
	
	@Mock
	KafkaPublisherService kafka;

	@Test
	public void testBuscarPorNfse() {
		var creditoService = Mockito.mock(CreditoService.class);

		var credito = new Credito();
		credito.setNumeroNfse("123");

		Mockito.when(creditoService.buscarPorNfse("123")).thenReturn(List.of(credito));
		var resultado = creditoService.buscarPorNfse("123");

		assertEquals(1, resultado.size());
	}
}
