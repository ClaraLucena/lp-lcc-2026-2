package br.ufpb.dcx.lucena.clara.ex7;

import java.util.ArrayList;

public class MeuSistemaBiblioteca implements SistemaBiblioteca{
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
            System.out.println(livro.getAutor());
        }
    }
}
