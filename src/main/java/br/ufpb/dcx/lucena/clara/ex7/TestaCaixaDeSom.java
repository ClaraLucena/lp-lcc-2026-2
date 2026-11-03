package br.ufpb.dcx.lucena.clara.ex7;

public class TestaCaixaDeSom {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Cachorro ("Teddy"));
        caixa.adicionarEmissor(new Cachorro("Théo"));
        caixa.adicionarEmissor(new Tambor("M", "Kadosh" ));

        caixa.tocarTodosOsEmissores();
    }

}
