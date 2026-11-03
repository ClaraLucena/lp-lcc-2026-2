package br.ufpb.dcx.lucena.clara.ex7;

public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        return this.lado*this.lado;
    }
    public double getLado(){
        return this.lado;
    }

    public void setLado(double novoLado) {
        this.lado = novoLado;
    }
    public String toString(){
        return "Área do quadrado: " + this.calcularArea();
    }
}
