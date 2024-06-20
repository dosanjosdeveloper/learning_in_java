public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //throw new RuntimeException(e);
            System.out.println("Cep não corresponde ao válido!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw  new CepInvalidoException();

        //Simulando um cep formatado
        return "23.765-064";
    }
}
