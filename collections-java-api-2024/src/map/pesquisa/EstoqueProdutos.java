package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutoMap();

        estoque.adicionarProdutoMap(1L,"Produto A",10,5.0);
        estoque.adicionarProdutoMap(2L,"Produto B",5,10.0);
        estoque.adicionarProdutoMap(3L,"Produto C",2,15.0);

        estoque.exibirProdutoMap();
        System.out.println("Valor total do estoque: R$ "+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
    }

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutoMap(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutoMap(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }
}
