package br.ufpb.dcx.lucena.clara.series;

public class cadastro {
    private String titulo;
    private String genero;
    private int quantidadeTemporadas;
    private double avaliacao; // Ex: nota de 0.0 a 10.0

    // 2. Construtor sem parâmetros (Construtor Padrão)
    public cadastro() {
    }

    // 3. Construtor com todos os parâmetros
    public cadastro(String titulo, String genero, int quantidadeTemporadas, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.avaliacao = avaliacao;
    }

    // 4. Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(int quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String toString() {
        return "Série: " + titulo + " | Gênero: " + genero + " | Temporadas: " + quantidadeTemporadas + " | Nota: " + avaliacao;
    }

}
