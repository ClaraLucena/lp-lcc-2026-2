package br.ufpb.dcx.lucena.clara.ex7;

public class Tambor implements EmissorDeSom {
    private String marca;
    private String tamanho;

    public Tambor(String marca, String tamanho){
        this.marca = marca;
        this.tamanho = tamanho;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }
    public String emitirSom() {
        return "Tum tum";
    }
}
