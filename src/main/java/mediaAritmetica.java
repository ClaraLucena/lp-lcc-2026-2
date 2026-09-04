import javax.swing.JOptionPane;
public class mediaAritmetica {
    public static void main(String[] args) {
        String nota1str = JOptionPane.showInputDialog("Digite a primeira nota");
        String nota2str = JOptionPane.showInputDialog("Digite a segunda nota");
        double nota1 = Double.parseDouble(nota1str);
        double nota2 = Double.parseDouble(nota2str);
        double media = (nota1 + nota2) / 2;
        System.out.println("Media Aritmética: " + media);
        JOptionPane.showMessageDialog(null, "Sua média é " + media);
    }
}