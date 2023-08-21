package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("livro",2.50,2);
        carrinhoDeCompras.adicionarItem("mouse",2.50,1);

        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println("TOTAL: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
