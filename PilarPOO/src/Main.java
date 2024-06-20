//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("789456");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("963258");
        //z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}