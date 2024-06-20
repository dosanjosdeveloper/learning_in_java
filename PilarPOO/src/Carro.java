public class Carro extends Veiculo{

    public void ligar(){

        confereCambio();
        confereComustivem();

        System.out.println("Carro Ligado");
    }

    private void confereComustivem(){
        System.out.println("Conferindo Combustível. . .");
    }

    private   void confereCambio(){
        System.out.println("Conferindo Cambio em P");
    }
}
