package com.desafio.creditos.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.creditos.model.Credito;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Long> {
  List<Credito> findByNumeroNfse(String numeroNfse);
  Credito findByNumeroCredito(String numeroCredito);
}
