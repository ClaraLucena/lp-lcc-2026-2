package br.ufpb.dcx.lucena.clara.banco;
import java.util.ArrayList;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new  ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3")); //... ...
        // 1. Abrir uma nova conta
        meuBanco.abrirConta("CPF_DO_CLIENTE", "444-4", "333-3", 0.0);

        // 2. Transferir R$ 100,00 para a nova conta
        meuBanco.transferir("222-2", "333-3", "444-4", "333-3", 100.0);

        // 3. Consultar e imprimir o saldo da nova conta
        System.out.println(meuBanco.consultarSaldoDeConta("444-4", "333-3"));

        // 4. Pesquisar contas com saldo negativo
        for (Conta conta : meuBanco.pesquisarContasComSaldoNegativo()) {
            System.out.println(conta);
        }
    }
}
