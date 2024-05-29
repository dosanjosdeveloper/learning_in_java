public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5;numero++){
            if (numero == 3) {
                System.out.println("Vou parar!");
            //                break;
                continue;
            }
            System.out.println("Numero: "+numero);
        }
    }
}
