package com.fcamara.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fcamara.backend.domain.estabelecimento.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	
}
