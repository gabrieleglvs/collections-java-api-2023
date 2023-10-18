package list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    //método construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //para que ele imprima as tarefas e não o endereço de memória dela
    @Override
    public String toString() {
        return "Tarefa{" +
            "descricao='" + descricao + '\'' +
            '}';
    }
}
