package br.uam.entities;

/**
 *
 * @author Joao Rodolfo
 */
public class ConversorMoeda {

    private double taxaDolarParaReal;

    public ConversorMoeda(double taxaDolarParaReal) {
        this.taxaDolarParaReal = taxaDolarParaReal;
    }

    public double dolarParaReal(double valorDolar) {
        return valorDolar * taxaDolarParaReal;
    }

    public double realParaDolar(double valorReal) {
        return valorReal / taxaDolarParaReal;
    }
}
