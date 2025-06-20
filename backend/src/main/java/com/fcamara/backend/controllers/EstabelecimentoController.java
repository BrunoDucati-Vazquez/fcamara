package com.fcamara.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fcamara.backend.domain.estabelecimento.DTOS.EstabelecimentoResponseDTO;
import com.fcamara.backend.services.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class EstabelecimentoController {
    
    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping("/estabelecimentos")
    public ResponseEntity<Page<EstabelecimentoResponseDTO>> getAllEstabelecimentos(
       @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        
            Pageable pageable = PageRequest.of(page, size);
            Page<EstabelecimentoResponseDTO> estabelecimentos = estabelecimentoService.getAllEstabelecimentos(pageable);
            return ResponseEntity.ok(estabelecimentos);
    }
    
}
