package Aula24_labs;

/**
 * Usando o resultado do exercício anterior como base, crie uma classe "LivroDeLivraria" que represente
 * os dados básicos de um libreo que está à venda em uma Livraria.
 */

public class LivroLivraria_Ex03 {
    public static void main(String[] args) {

        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
