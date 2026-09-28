package br.ufpb.dcx.lucena.clara.programas;

import java.util.Scanner;
public class cores {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        String [] cores = new String[11];
        for (int i = 0; i < cores.length; i++){
            System.out.println("Digite o nome da cor: ");
            cores[i] = leitor.nextLine();
        }
        int azul = 0;
        int rosa = 0;
        for (int i = 0; i < cores.length; i++) {

            if (cores[i].equals("azul")) {
                azul++;
            } else {
                rosa++;
            }
        }

        if (azul > rosa) {
            System.out.println("azul");
        } else {
            System.out.println("rosa");
        }

        leitor.close();
    }
}
