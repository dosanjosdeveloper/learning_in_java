package set.opercaoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidados> convidadosSet;

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidados() +" convidado(s) dentro do Set convidados.");
        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1236);

        conjuntoConvidados.exibir();


        System.out.println("Existem "+conjuntoConvidados.contarConvidados() +" convidado(s) dentro do Set convidados.");

        conjuntoConvidados.removeConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+conjuntoConvidados.contarConvidados() +" convidado(s) dentro do Set convidados.");


    }

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removeConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidadosSet){
            if (c.getCodigoonvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibir(){
        System.out.println(convidadosSet);
    }

}
