package com.example.practica7.models;

public class Celcius extends grado {
    public Celcius(double valor) {
        super(valor);
    }

    @Override
    public double convertirACelsius() {
        return valor;
    }

    @Override
    public double convertirAKelvin() {
        return valor + 273.15;
    }

    @Override
    public double convertirAFahrenheit() {
        return (valor * 9/5) + 32;
    }
}