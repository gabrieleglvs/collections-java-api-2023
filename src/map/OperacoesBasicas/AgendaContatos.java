package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //método: adiciona um contato à agenda, associando o nome do contato ao número de telfone correspondente.
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    //método: remove um contato da agenda, dado o nome do contato.
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    //método: exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
