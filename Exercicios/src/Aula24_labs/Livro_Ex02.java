package Aula24_labs;

/**
 * Crie uma classe para representar os dados básicos de um livro, sem se preocupar com sua finalidade.
 */

public class Livro_Ex02 {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);

    }
}
