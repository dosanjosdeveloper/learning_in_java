package set.opercaoesbasicas;

import java.util.Objects;

public class Convidados {
    private String nome;
    private int codigoonvite;

    public Convidados(String nome, int codigoonvite) {
        this.nome = nome;
        this.codigoonvite = codigoonvite;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Convidados that = (Convidados) object;
        return codigoonvite == that.codigoonvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoonvite);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoonvite() {
        return codigoonvite;
    }

    @Override
    public String toString() {
        return "Convidados{" +
                "nome='" + nome + '\'' +
                ", codigoonvite=" + codigoonvite +
                '}';
    }
}
