public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "A";

        /**
         * Recebe a variável com o valor atribuido
         * */
        switch (sigla){
            /**
             * Executa a condicional checando o caso
             * */
            case "P":
                // Caso Verdade Imprime
                System.out.println("PEQUENO");
                // Interrompe a execução saindo da condicional.
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
