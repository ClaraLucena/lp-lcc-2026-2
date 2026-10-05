package br.ufpb.dcx.lucena.clara.agenda;
import javax.swing.JOptionPane;
import java.util.List;

public class ProgamaAgenda {
    public static void main(String [] args) {
        int maxContatos = 1000;
        AgendaEnderecos agenda = new AgendaEnderecos(maxContatos);
        boolean sair = false;
        while (!sair) {
            String opcaoStr = JOptionPane.showInputDialog(
                    "Digite uma opção:\n"
                            + "1. Cadastrar contato\n"
                            + "2. Pesquisa endereço por nome\n"
                            + "3. Pesquisa contato completo por nome\n"
                            + "4. Listar todos os contatos\n"
                            + "5. Pesquisa número de contatos do bairro\n"
                            + "6. Apaga contato\n"
                            + "7. Sair\n");

            if (opcaoStr == null) {
                break;
            }

            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }

            switch(opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual o nome?");
                    String telefone = JOptionPane.showInputDialog("Qual o telefone?");
                    String logradouro = JOptionPane.showInputDialog("Qual o logradouro (Rua, Av...)?");
                    String numero = JOptionPane.showInputDialog("Qual o número?");
                    String bairro = JOptionPane.showInputDialog("Qual o bairro?");
                    Endereco end = new Endereco(logradouro, numero, bairro, "João Pessoa", "Paraíba");
                    Contato c = new Contato(nome, telefone, end);
                    if (agenda.cadastraContato(c)) {
                        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Agenda cheia!");
                    }
                    break;
                case 2:
                    String nomeContato = JOptionPane.showInputDialog("Qual o nome do contato?");
                    Endereco enderecoAchado = agenda.pesquisaEndereco(nomeContato);
                    if (enderecoAchado != null) {
                        JOptionPane.showMessageDialog(null, enderecoAchado.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado");
                    }
                    break;
                case 3:
                    String nomePesquisa = JOptionPane.showInputDialog("Qual o nome do contato?");
                    Contato contatoAchado = agenda.pesquisaContato(nomePesquisa);
                    if (contatoAchado != null) {
                        JOptionPane.showMessageDialog(null, contatoAchado.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado");
                    }
                    break;
                case 4:
                    List<Contato> todos = agenda.listarTodosOsContatos();
                    if (todos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado.");
                    } else {
                        StringBuilder sb = new StringBuilder("--- LISTA DE CONTATOS ---\n");
                        for (Contato ct : todos) {
                            sb.append(ct.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;
                case 5:
                    String nomeBairro = JOptionPane.showInputDialog("Qual bairro?");
                    int numContatosBairro = agenda.pesquisarQuantidadeDeContatosDoBairro(nomeBairro);
                    JOptionPane.showMessageDialog(null, "Quantidade: " + numContatosBairro);
                    break;
                case 6:
                    String nomeContatoApagar = JOptionPane.showInputDialog("Qual o nome do contato?");
                    boolean apagou = agenda.apagaContato(nomeContatoApagar);
                    if (apagou) {
                        JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha: Contato não encontrado.");
                    }
                    break;
                case 7:
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
        JOptionPane.showMessageDialog(null, "Até mais!");
    }
}
