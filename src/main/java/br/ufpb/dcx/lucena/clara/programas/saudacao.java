package br.ufpb.dcx.lucena.clara.programas;

import javax.swing.*;

public class saudacao {
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String cidade = JOptionPane.showInputDialog("Digite sua cidade");
        System.out.println("Oi " + nome + "! Que legal saber que você é da cidade " + cidade);
    }
}
