package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadstroProdutod {
    private Set<Produto> produtosSet;

    public static void main(String[] args) {
        CadstroProdutod cadstroProdutod = new CadstroProdutod();
        cadstroProdutod.adicionarProduto("Produto 5",1l,15d,5);
        cadstroProdutod.adicionarProduto("Produto 0",2l,20d,10);
        cadstroProdutod.adicionarProduto("Produto 3",1l,10d,2);
        cadstroProdutod.adicionarProduto("Produto 9",9l,2d,2);

        cadstroProdutod.exibirPorPreco();
        cadstroProdutod.exibirProdutosPorNome();

    }

    public CadstroProdutod( ){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtosSet.add(new Produto(nome,codigo,preco,quantidade ));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }


}
