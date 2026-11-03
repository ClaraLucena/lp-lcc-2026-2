package br.ufpb.dcx.lucena.clara.ex7;

public class Cachorro implements EmissorDeSom {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String emitirSom() {
        return "au au";
    }
}
