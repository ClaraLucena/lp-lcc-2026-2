import java.util.Scanner;

public class Adivinha {

    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random() * (maximo + 1)); // gera número inteiro entre [0-maximo]
        return x;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;

        while (!acertou) {
            System.out.println("Tente adivinhar y [0-100]:");

            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;

            if (numLido == y) {
                System.out.println("Parabéns! Você acertou. Número de tentativas: " + tentativas);
                acertou = true;

            } else {
                pontos = pontos - 2;

                if (y > numLido) {
                    System.out.println("Errou! O número sorteado é maior.");
                } else {
                    System.out.println("Errou! O número sorteado é menor.");
                }
            }
        }

        System.out.println("Pontuação final: " + pontos);

        leitor.close();
    }
}