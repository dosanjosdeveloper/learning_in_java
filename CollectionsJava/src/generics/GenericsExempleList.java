package generics;


import java.util.ArrayList;
import java.util.List;


public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite adicionar qualquertipo de objeto

        // Exemplo com Generics - Não permite adicionar elemntos/objetos diferentes do tipo String
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for (String elemento: listaGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generics (Necessário fazer Cast)
        for (Object elemento : listaSemGenerics){
            String str = String.valueOf(elemento);
            System.out.println(str);
        }


    }
}
