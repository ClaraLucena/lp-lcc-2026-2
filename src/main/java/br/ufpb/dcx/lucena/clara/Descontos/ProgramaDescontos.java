package br.ufpb.dcx.lucena.clara.Descontos;
import java.util.Scanner;

public class ProgramaDescontos {
    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto < 50){
            return (valorProduto);
        } else if (valorProduto < 100){
            return (valorProduto - (valorProduto*0.05));
            //5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto*0.10));
            //10% de desconto
        }
    }
    public static double calculaSomatorioDescontos(Produto [] produto){
        double total = 0;
        for (int i = 0; i < produto.length; i++){
            double precoOriginal = produto[i].getPreco();
            double precoComDesconto = calculaValorComDesconto(precoOriginal);
            double desconto = precoOriginal - precoComDesconto;
            total += desconto;
        }
        return total;
    }
    public static String verificaProdutoComMaiorDesconto ( Produto [] produto){
        Produto maiorDesconto = produto[0];
        double maior = produto[0].getPreco() - calculaValorComDesconto(produto[0].getPreco());
        for (int i = 1; i < produto.length; i++){
            double desconto = produto[i].getPreco() - calculaValorComDesconto(produto[i].getPreco());
            if (desconto > maior){
                maior = desconto;
                maiorDesconto = produto[i];
            }
        }
        return maiorDesconto.getNome();
    }

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto [quant];
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto =
                    calculaValorComDesconto(p.getPreco());
            System.out.printf(
                    "O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = p;
        }
        leitor.close();
    }



}
