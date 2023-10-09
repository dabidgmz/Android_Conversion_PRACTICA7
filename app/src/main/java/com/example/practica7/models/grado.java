package com.example.practica7.models;

public abstract class grado {
    protected double valor;

    public grado(double valor) {
        this.valor = valor;
    }

    public abstract double convertirACelsius();
    public abstract double convertirAKelvin();
    public abstract double convertirAFahrenheit();
}
