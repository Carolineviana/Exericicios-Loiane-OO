package Aula27_labs;

/**
 * Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
 * Desenvolva métodos para ligar, desligar a lâmpada.
 */

public class Lampada_Ex01 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

    }
}
