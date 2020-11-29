package com.teste01.exercicio01;

/**
 * Classe que representa dados de uma eleição.
 */
public class Eleicao {

    private Double totalEleitores;
    private Double votosValidos;
    private Double votosBrancos;
    private Double votosNulos;

    /**
     * Construtor responsável por construir o objeto Eleicao.
     * @param totalEleitores
     * @param votosValidos
     * @param votosBrancos
     * @param votosNulos
     */
    public Eleicao(Double totalEleitores, Double votosValidos, Double votosBrancos, Double votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    /**
     * Método responsável por calcular percentual de votos válidos
     * @return percentual calculado
     */
    public Double getPercentualDeVotosValidos() {
        return (votosValidos / totalEleitores) * 100.00;
    }

    /**
     * Método responsável por calcular percentual de votos brancos
     * @return percentual calculado
     */
    public Double getPercentualDeVotosBrancos() {
        return (votosBrancos / totalEleitores) * 100.00;
    }

    /**
     * Método responsável por calcular percentual de votos nulos
     * @return percentual calculado
     */
    public Double getPercentualDeVotosNulos() {
        return (votosNulos / totalEleitores) * 100.00;
    }

    public Double getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(Double totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public Double getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(Double votosValidos) {
        this.votosValidos = votosValidos;
    }

    public Double getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(Double votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public Double getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(Double votosNulos) {
        this.votosNulos = votosNulos;
    }
}
