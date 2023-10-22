package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //método construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //método:  Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //método: Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    //Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //método: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" +estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " +estoque.obterProdutoMaisCaro());
    }
}
