package br.ufpb.dcx.lucena.clara.programas;

import javax.swing.JOptionPane;
public class frutas {
    public static void main(String[] args) {
        int maca = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade maçãs"));
        int mamao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade mamões"));
        double total = maca * 1.0 + mamao * 3.50;
        JOptionPane.showMessageDialog(null, "O valor a ser pago é de R$" + total);
    }
}
