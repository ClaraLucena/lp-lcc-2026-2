package br.ufpb.dcx.lucena.clara.ex7;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
}
