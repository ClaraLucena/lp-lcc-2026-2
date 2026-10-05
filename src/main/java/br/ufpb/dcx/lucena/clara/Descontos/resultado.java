package br.ufpb.dcx.lucena.clara.Descontos;

public class resultado {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];

        produtos[0] = new Produto("Calça Jeans", 50.0);
        produtos[1] = new Produto("Short", 35.0);
        produtos[2] = new Produto("Vestido", 120.0);

        double somatorio = ProgramaDescontos.calculaSomatorioDescontos(produtos);

        String produtoMaiorDesconto = ProgramaDescontos.verificaProdutoComMaiorDesconto(produtos);

        System.out.printf("Somatório dos descontos: R$ %.2f\n", somatorio);

        System.out.println("Produto com maior desconto: "
                + produtoMaiorDesconto);
    }
}
