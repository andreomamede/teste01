package com.teste01.exercicio03;

/**
 * Classe responsável por calcular o fatorial de um número.
 */
public class Fatorial {

    public static void main(String[] args) {
        int numero = 6;

        System.out.println("O fatorial do número " + numero + " é: " + calculaFatorial(numero));
    }

    public static int calculaFatorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }
}