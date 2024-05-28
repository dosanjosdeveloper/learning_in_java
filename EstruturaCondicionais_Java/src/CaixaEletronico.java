public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolcitado = 17.0;
        if (valorSolcitado < saldo){
            saldo=saldo - valorSolcitado;
        }else {
            System.out.println("Saldo Insuficiente");
        }

        System.out.println("Saldo Atual "+saldo);
    }
}
