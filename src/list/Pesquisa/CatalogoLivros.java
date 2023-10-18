package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    //método construtor que instancia um ArrayList vazio.
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //método que adiciona um livro na lista
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //método que retorna uma lista de livros pesquisa por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        
        //primeiro: criar uma lista de livros vazia, aonde vou guardar apenas os livros daquele determinado autor
        List<Livro> livrosPorAutor = new ArrayList<>();
        
        //segundo: se a lista não estiver vazia
        if(!livroList.isEmpty()) {
            //para cada livro na minha lista
            for(Livro l : livroList) {
                //irei pegar o autor que foi passado por parametro
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    //e adicionar a lista que eu criei no primero passo
                    livrosPorAutor.add(l);
                }
            }
        } return livrosPorAutor;
    }

    //método que retorna uma lista de livros publicados em determinado intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        //primeiro: criar uma lista de livros vazia, aonde vou guardar apenas os livros daquele determinado intervalo de anos
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        
        //segundo: se a lista não estiver vazia
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //método que retorna apenas o primeiro livro que encontrar com base no título do livro
    public Livro pesquisarPorTitulo(String titulo) {

        //null por que ainda não tenho o obj(livro) que irá instanciar esse unico livro
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
