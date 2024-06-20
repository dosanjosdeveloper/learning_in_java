import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite seu Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu Sobrenome:");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo ususário
        System.out.println("Olá, me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos.");
        System.out.println("Minha altura é "+altura+" metros");
        scanner.close();
        }catch (Exception e){
            System.out.println("Message "+e.getMessage()+"\n" +
                    "Causa "+e.getCause()+"\n"+
                    "Rastreio "+e.getStackTrace());
        }
    }
}
