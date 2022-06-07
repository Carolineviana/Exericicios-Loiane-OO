package Aula27_labs;

/**
 * Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
 * Desenvolva métodos para ligar, desligar a lâmpada.
 */

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada) {
            System.out.println("A Lâmpada está ligada");
        } else {
            System.out.println("A Lâmpada está desligada");
        }
    }
    void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
