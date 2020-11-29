package com.teste01.exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        Eleicao eleicao01 = new Eleicao(1000.00, 800.00, 150.00, 50.00);

        System.out.println("Percentual de votos válidos e relação ao total de eleitores " + eleicao01.getPercentualDeVotosValidos()+"%");
        System.out.println("Percentual de votos brancos e relação ao total de eleitores " + eleicao01.getPercentualDeVotosBrancos()+"%");
        System.out.println("Percentual de votos nulos e relação ao total de eleitores " + eleicao01.getPercentualDeVotosNulos()+"%");

    }

}
