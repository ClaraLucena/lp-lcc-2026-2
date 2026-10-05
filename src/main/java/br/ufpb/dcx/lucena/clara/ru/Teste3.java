package br.ufpb.dcx.lucena.clara.ru;
import java.util.Scanner;
public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR"); String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }

    //TODO: Código a acrescentar
        System.out.println(calculaQuantidade(refeicoes));
        verificaref("CAFÉ", refeicoes);
        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    }

    public static int calculaQuantidade(RefeicaoRealizada [] refeicao){
        int quantidade = 0;
        for (int k = 0; k < refeicao.length; k++){
            if (refeicao[k].equals("ALMOÇO")){
                quantidade++;
            }
        }
        return quantidade;
    }
    public static String verificaref(String tipo, RefeicaoRealizada [] refeicao){
        for (int k = 0; k < refeicao.length; k++){
            if (refeicao[k].getTipoRefeicao().equalsIgnoreCase(tipo)){
                return "Sim";
            }
        }
        return "Não";
    }

}

