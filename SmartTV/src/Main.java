//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? "+smartTV.ligada);
        System.out.println("Canal "+smartTV.canal);
        System.out.println("VOLUME "+smartTV.volume);

        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.descerCanal();
        smartTV.descerCanal();
        smartTV.descerCanal();
        System.out.println("TV Ligada? "+smartTV.ligada);
        System.out.println("Canal "+smartTV.canal);
        System.out.println("VOLUME "+smartTV.volume);
        }
    }