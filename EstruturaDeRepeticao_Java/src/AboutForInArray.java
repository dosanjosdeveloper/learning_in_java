public class AboutForInArray {
    public static void main(String[] args) {
        /**
         * Em Arrays o indice dos elementos inicializa com 0
         * */
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("Aluno no indice x="+x+" é "+alunos[x]);
        }

        /**
         * Temos também o foreach
         * */

        for(String aluno:alunos){
            System.out.println("Nome do Aluno é: "+aluno);
        }

    }
}
