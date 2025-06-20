package com.fcamara.backend.domain.estabelecimento.DTOS;

public record EstabelecimentoResponseDTO(String nome, String cnpj, String endereço, String telefone, Integer vagaMotos, Integer vagaCarros) {
	
}
