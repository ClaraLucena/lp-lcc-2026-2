package br.ufpb.dcx.lucena.clara.ru;

import java.util.Scanner;

public class PrecoAlmoco {
//    public static void main(String args[]) {
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite a quantidade de refeições do tipo ALMOÇO realizadas: ");
//        int num = Integer.parseInt(leitor.nextLine());
//        System.out.println("Digite o valor do ALMOÇO: ");
//        double almoco = Double.parseDouble(leitor.nextLine());
//
//        double total = almoco * num;
//        System.out.println("TOTAL DE GASTOS DO ALMOÇO: " + total);
//
//        leitor.close();
//    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade N de almoços realizados:");
        int n = Integer.parseInt(leitor.nextLine());

        double totalGasto = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o preço do almoço [" + (i + 1) + "]:");
            double preco = Double.parseDouble(leitor.nextLine());
            totalGasto += preco;
        }

        System.out.printf("Valor total gasto pelo RU com almoços: R$ %.2f\n", totalGasto);

        leitor.close();
    }
}

