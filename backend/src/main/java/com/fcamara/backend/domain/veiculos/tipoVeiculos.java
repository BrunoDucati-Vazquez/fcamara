package com.fcamara.backend.domain.veiculos;

public enum tipoVeiculos {
    MOTO("motos"),
    CARRO("carros");

    private String tipoVeiculos;

    tipoVeiculos(String tipoVeiculo) {
        this.tipoVeiculos = tipoVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculos;
    }
}
