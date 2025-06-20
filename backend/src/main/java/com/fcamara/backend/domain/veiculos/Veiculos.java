package com.fcamara.backend.domain.veiculos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "veiculos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculos {
    
    private String marca;

    private String modelo;

    private String cor;

    private String placa;

    private String tipo;
}
