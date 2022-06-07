package Aula24_labs;

/**
 * Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente
 * os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.
 */

import java.util.Date;

public class LivroBiblioteca_Ex04 {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Caroline";

        System.out.println("Nome do livro = " + livro.nome);

    }
}
