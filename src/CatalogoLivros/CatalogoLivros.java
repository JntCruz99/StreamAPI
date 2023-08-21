package CatalogoLivros;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        return livros.stream()
                .filter(livro -> livro.getAutor().equals(autor))
                .collect(Collectors.toList());
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        return livros.stream()
                .filter(livro -> livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal)
                .collect(Collectors.toList());
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        return livros.stream()
                .filter(livro -> Objects.equals(livro.getTitulo(), titulo)).toList();
    }


}
