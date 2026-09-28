package br.ufpb.dcx.lucena.clara.programas;

import javax.swing.JOptionPane;
public class compras {
    public static void main(String [] args){
        String valorstr = JOptionPane.showInputDialog("Digite o valor da compra");
        double valor = Double.parseDouble(valorstr);
        String descontostr = JOptionPane.showInputDialog("Digite o percentual de desconto");
        double desconto = Double.parseDouble(descontostr);
        double total = valor * desconto/100;
        JOptionPane.showMessageDialog(null, "O valor da sua compra com desconto é " + total);
    }

}
