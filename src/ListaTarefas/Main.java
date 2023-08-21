package ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Fazer o almoço");
        listaTarefas.adicionarTarefa("vai ser excluido");
        listaTarefas.adicionarTarefa("Arma tantantam");

        listaTarefas.removerTarefa("vai ser excluido");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.ordenarTarefa());
        listaTarefas.obterDescricoesTarefas();
    }
}
