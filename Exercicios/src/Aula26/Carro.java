package Aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km.");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }
}
