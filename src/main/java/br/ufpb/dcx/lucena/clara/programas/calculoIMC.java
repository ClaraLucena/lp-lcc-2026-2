package br.ufpb.dcx.lucena.clara.programas;

import javax.swing.JOptionPane;
public class calculoIMC {
    public static void main(String [] args){
        String pesoString =  JOptionPane.showInputDialog("Digite seu peso");
        double peso = Double.parseDouble(pesoString);
        String alturastr = JOptionPane.showInputDialog("Digite sua altura");
        double altura = Double.parseDouble(alturastr);
        double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é " + imc);
    }
}
