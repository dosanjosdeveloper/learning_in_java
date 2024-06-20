package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atribute
    private List<Pessoa> pessoaList;

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoas("Nome 1",20,1.56);
        ordenacaoPessoa.adicionarPessoas("Nome 2",30,1.80);
        ordenacaoPessoa.adicionarPessoas("Nome 3",25,1.70);
        ordenacaoPessoa.adicionarPessoas("Nome 4",17,1.56);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println("Ordem por PessoaIdade: "+ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordem por PessoaAltura: "+ordenacaoPessoa.ordenarPorAltura());

    }

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome,int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
