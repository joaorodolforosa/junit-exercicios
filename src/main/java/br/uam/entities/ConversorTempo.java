package br.uam.entities;

/**
 *
 * @author Joao Rodolfo
 */
public class ConversorTempo {

    public String converterSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        return horas + " horas, " + minutos + " minutos, " + segundosRestantes + " segundos";
    }
}

