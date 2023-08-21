package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public double calcularValorTotal() {
        return itens.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
    }
    public String exibirItens() {
        List<Item> itensOrdenados = itens.stream()
                .sorted()
                .toList();

        return itensOrdenados.stream()
                .map(Item::toString)
                .collect(Collectors.joining("\n"));
    }

}
