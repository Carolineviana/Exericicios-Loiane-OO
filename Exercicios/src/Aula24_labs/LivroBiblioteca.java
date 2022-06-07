package Aula24_labs;

/**
 * Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente
 * os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.
 */

import java.util.Date;

public class LivroBiblioteca {

    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;

    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;

}
