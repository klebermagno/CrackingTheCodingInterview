package com.klebermagno.code.advanced.functional;

@FunctionalInterface
interface CalculadorDeArea {
    int calcular(int lado);
}

public class Quadrado {
    private int lado;

    public Quadrado lado(int valor) {
        this.lado = valor;
        return this;
    }

    public int area(CalculadorDeArea calculador) {
        return calculador.calcular(lado);
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        int resultado = quadrado.lado(2).area(lado -> lado * lado);
        System.out.println("A área do quadrado é: " + resultado);
    }
}