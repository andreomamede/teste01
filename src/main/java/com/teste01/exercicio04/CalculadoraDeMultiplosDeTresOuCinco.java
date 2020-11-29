package com.teste01.exercicio04;

/**
 * Classe responsável pelo cálculo de números multiplos de 3 ou 5.
 */
public class CalculadoraDeMultiplosDeTresOuCinco {

    private static final Integer MULTIPLO_TRES = 3;
    private static final Integer MULTIPLO_CINCO = 5;

    public static void main(String[] args) {

        //Valor X de entrada
        Integer valorDeEntrada = 10;

        Integer soma = 0;
        for (int i = 0; i < valorDeEntrada; i++) {
            if (isMultiploDeTresOuCinco(i)) {
                soma = soma + i;
            }
        }

        System.out.println("A soma de todos os números multiplos de 3 ou 5 abaixo de " + valorDeEntrada + " é " + soma);
    }

    /**
     * Verifica se o número recebido por parametros é multiplo de 3 ou 5.
     * @param numero
     * @return
     */
    static Boolean isMultiploDeTresOuCinco(Integer numero) {
        if (numero % MULTIPLO_TRES == 0 || numero % MULTIPLO_CINCO == 0) {
            return true;
        }
        return false;
    }

}
