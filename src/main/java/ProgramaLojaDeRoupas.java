package br.ufpb.dcx.ayla.roupas;

import java.util.Scanner;

public class ProgramaLojaDeRoupas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas roupas você quer cadastrar?");
        int max = Integer.parseInt(leitor.nextLine());

        int[] codigosRoupas = new int[max];
        String[] descricoesRoupas = new String[max];
        int[] numeroDePecas = new int[max];

        for (int k = 0; k < max; k++) {

            System.out.println("Qual o código da roupa?");
            codigosRoupas[k] = Integer.parseInt(leitor.nextLine());

            System.out.println("Qual a descrição desta roupa?");
            descricoesRoupas[k] = leitor.nextLine();

            System.out.println("Qual o número de peças desta roupa a cadastrar?");
            numeroDePecas[k] = Integer.parseInt(leitor.nextLine());
        }

        imprimirRoupasCadastradas(codigosRoupas, descricoesRoupas, numeroDePecas);

        leitor.close();
    }

    public static void imprimirRoupasCadastradas(int[] codigos, String[] descricoes,
                                                 int[] quantidades) {

        for (int k = 0; k < codigos.length; k++) {

            System.out.println("Código da roupa: " + codigos[k]
                    + ", Descrição: " + descricoes[k]
                    + ", Quantidade: " + quantidades[k]);

        }
    }
}