package com.fcamara.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import com.fcamara.backend.domain.estabelecimento.Estabelecimento;
import com.fcamara.backend.domain.estabelecimento.DTOS.EstabelecimentoResponseDTO;
import com.fcamara.backend.repositories.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    
    public Page<EstabelecimentoResponseDTO> getAllEstabelecimentos(Pageable pageable) {
        return estabelecimentoRepository.findAll(pageable)
                .map(this::toResponseDTO);
    }

    private EstabelecimentoResponseDTO toResponseDTO(Estabelecimento estabelecimento) {
        return new EstabelecimentoResponseDTO(
            estabelecimento.getNome(),
            estabelecimento.getCnpj(),
            estabelecimento.getEndereco(),
            estabelecimento.getTelefone(),
            estabelecimento.getVagaMotos(),
            estabelecimento.getVagaCarros()
        );
    }

}
