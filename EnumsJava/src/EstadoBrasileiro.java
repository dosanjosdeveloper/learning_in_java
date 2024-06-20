public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo",11),
    RIO_JANEIRO("RJ","Rio De Janeiro",12),
    PIAUI ("PI","Piauí",13),
    MARANHAO ("MA","Maranhão",14),
    CEARA("CE","Ceará",15);

    private String nome;
    private String sigla;
    private int ibge;

    public int getIbge() {
        return ibge;
    }

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
