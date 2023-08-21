package ListaTarefas;

import CarrinhoDeCompras.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public List<Tarefa> ordenarTarefa(){
        return tarefas.stream()
                .sorted()
                .toList();
    }
    public void obterDescricoesTarefas() {
        List<String> descricaoList =  tarefas.stream()
                .map(Tarefa::getDescricao)
                .toList();
        descricaoList.forEach(System.out::println);
    }

}
