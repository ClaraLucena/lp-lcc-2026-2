package br.ufpb.dcx.lucena.clara.exercicio07;
import java.util.Scanner;
import java.util.ArrayList;
public class TestePessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int cont = 0;
        while (cont < 5){
            System.out.println("Digite o nome:");
            String nome = leitor.nextLine();

            System.out.println("Digite a idade:");
            int idade = leitor.nextInt();
            leitor.nextLine();

            Pessoa pessoa = new Pessoa(nome, idade);

            pessoas.add(pessoa);

            cont++;

        }
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());

            if (p.ehDeMaior()) {
                System.out.println("É de maior");
            } else {
                System.out.println("É de menor");
            }
        }
        leitor.close();
    }
}
