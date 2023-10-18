package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //método construtor
    public ListaTarefa() {
        //sempre que eu criar um obj ListaTarefa, ele vai criar um ArrayList vazio no atributo tarefaList.
        this.tarefaList = new ArrayList<>();
    }

    //método que adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //método que remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao) {
        //primeiro: criiando uma coleção das tarefas que eu quero remover.
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //segundo: para cara tarefa (t) da lista de tarefas, verifico se a descrição é igual a passada no parametro e se for adiciono à coleção tarefasParaRemover.
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        //terceiro: de fato remover da tarefaList tudo que armezenei no tarefasParaRemover.
        tarefaList.removeAll(tarefasParaRemover);
    }

    //método que retorna o total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //método que retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elentos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elentos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa(("Tarefa 1"));
        System.out.println("O número total de elentos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
