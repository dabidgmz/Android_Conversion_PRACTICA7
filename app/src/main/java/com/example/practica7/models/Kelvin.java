package com.example.practica7.models;

public class Kelvin extends grado {
    public Kelvin(double valor) {
        super(valor);
    }

    @Override
    public double convertirACelsius() {
        return valor - 273.15;
    }

    @Override
    public double convertirAKelvin() {
        return valor;
    }

    @Override
    public double convertirAFahrenheit() {
        return (valor - 273.15) * 9/5 + 32;
    }
}
