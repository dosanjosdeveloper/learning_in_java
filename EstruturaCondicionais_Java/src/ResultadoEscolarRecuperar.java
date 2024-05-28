public class ResultadoEscolarRecuperar {
    public static void main(String[] args) {
        int nota = 6;
        /**
         * Verificando se Nota é maior o igual a 7. Caso Verdadeiro imprime Aprovado caso Falso imprime Reprovado.
         * Demostrando que pode haver mais de duas condições
         * */
        if (nota >= 7 ){
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota > 7) {
            System.out.println("Em Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
