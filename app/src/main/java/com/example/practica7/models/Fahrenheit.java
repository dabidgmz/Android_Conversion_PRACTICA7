package com.example.practica7.models;

public class Fahrenheit extends grado {
    public Fahrenheit(double valor) {
        super(valor);
    }

    @Override
    public double convertirACelsius() {
        return (valor - 32) * 5/9;
    }

    @Override
    public double convertirAKelvin() {
        return (valor - 32) * 5/9 + 273.15;
    }

    @Override
    public double convertirAFahrenheit() {
        return valor;
    }
}
