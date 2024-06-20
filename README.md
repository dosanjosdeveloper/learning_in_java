# Learning in Java! 
This repository will be dedicated to recording all Java learnings.
Serving as a basis for future consultation.
I'm not good at this, but I'll try to keep it as organized as possible.  

### Let's go!!!

# Antes de tudo, o Java é Fortemente Tipado.

# Tipos Primitivos e Variáveis

Os tipos primitivos em Java e representam valores brutos. São eles;

Tipo    |   Memória |   Valor Minimo    |   Valor Máximo

int     |   1 byte  |   -128    |   127
byte    |   2 byte  | -32.768   | 32.768 
short
long
float   |   4 bytes |   -3,4028E + 38   |   3,4028E + 38
double  |   8 bytes |   -1,7976E + 308  |   1,7976E + 308
boolean
char

### Peculiaridades dos Tipos Primitivos
byte idade = 123;
short anoa = 2021;
int cep = 21070333; // Se começar com zero, talvez ser do tipo seja String
long cpf = 98765432109L; // Se começão com zero, talvez ser do tipo String. Necessário terminar com L para entender do tipo long.
float pi = 3.14f; // Quando do tipo float, inserir um F ou f no final do valor.
double salario = 1275.33;

## Variáveis Constantes
São valores armazenados em memória que não podem ser modificados depois de declarados. Essas variáveis são representandos pelas palavras reservadas *final*.
Por convenção, as Constantes são sempre escritas em caixa alta.


# -----------------------------------------------------------------
# Operadores

=   | Atribuição, define ou altera o valor de uma váriável
==  | Comparação Igualdade, compara se valor é igual a outro
>   | Comparação de Maior, se valor do lado esquerdo é maior
<   | Comparação de Menor, se valor do lado direito é menor.
+   | Operador de Adição ou Soma
*   | Operador de Multiplicação
/   | Operador de Divisão
-   | Operador de Subtração
%   | Operador Mode de Resto da Divisão
!=  | Operador da Diferença
>=  | Operador de Maior ou Igual
<=  | Operador de Menor ou Igual

## Operadores Unários
Esses operadores são aplciados juntamento com outro operador aritimetico. Realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
São eles:
(+) - Operador unário de valor positivo
(-) - Operador unário de valor negativo
(++) Operador unário de incremento de valor
(--) Operador unário de decremento de valor
(!) Operador lógico de negação

## Operador Ternário
É uma condição IF normal, porém com uma escrita reduzida somente em uma linha.
Exemplo: <Exepressão Condicional> ? <Caso condiçaõ seja true> : <Caso condição seja false>

    int a, b;
    a=5;
    b=6;
    resultado = a==b ? "Verdade":"Falso";

## Operadores Lógicos
&&  | Operador Lógico "E"
||  | Operador Lógico "OU"

# Métodos
Correspondem a funções ou cub-rotinas disponiveis dentro das classes.

### Critério de nomeação de métodos
* Seguir padrão camelCase
* Deve ser nomeado como verbo

# EXERCICIO
## Nome do Programa : SmartTV
Criar uma aplicação SmartTV, onde;
* Verifica o estado se a mesma está ligada
* Verifica o numero canal, seja incrementeal ou decremental de 1 em 1 ou digitando o número do canal desejado.
* Verificar o numero do volume,  seja incrementeal ou decremental de 1 em 1

# Escopo
O Escopo pode ser entendido como o ambiente onde uma variável pode sr acessada. Em java, o escopo de váriáveis vai de acordo com o blcoco onde ela foi declarada.

# Read the Documentation

@autor
@version
@since

# Terminal e Argumentos
### Explorar opções de entrada e saída de dados em uma aplicação Java.
## Como executar uma aplicação Java?
### Executar um arquivo bytecode .class
java minhaaplicacao.class

### Executar um arquivo com parâmetros
java minhaaplicacao JOSE RAFAEL 38 1.84

## Receber Argumentos na Inicialização da Aplicação

  String nome = args[0];
  String sobrenome = args[1];
  int idade = Integer.valueOf(args[2]);
  double altura = Double.valueOf(args[3])

  sout("Imprime os argumentos")

No arquivo launch.json add
{
    "type":"java",
    "request":"launch",
    "mainClass":"AboutMe",
    "args":[
        "RAFAEL",
        "DOS ANJOS",
        "38",
        "1.82"
    ]

}

## Entrada de Dados com Scanner
A classe Scanner permite a interação do usuário com a entrada de dado ao sistema.
 Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
 String dado = scanner.nextInt();

# -------------------- AGORA VALENDO ----------------
# Estruturas Condicionais com Java (Projeto - EstruturaCondicionais_Java) 
## Estrutura de Repetição.
* for
* while
* do-while
## Estrutura de Condição.
* if-else
* switch-case
## Estrutura de Exceções.
* try-catch-finally
* throw

## Condicional Simples - Exemplo: Caixa Eletrônico
    public class CaixaEletronico {
        public static void main(String[] args) {
            double saldo = 25.0;
            double valorSolcitado = 17.0;
            if (valorSolcitado < saldo){
                saldo=saldo - valorSolcitado;
            }else {
                System.out.println("Saldo Insuficiente");
            }
            System.out.println("Saldo Atual "+saldo);
        }
    }

## Condicionais Composta - Exemplo: ResultadoEscolar
Quando existe mais de fluxo amarrado a uma condição. Obsernando que acima se não existisse o else, a mesma seguiria Condicional Simples. Porém acabou sendo Condicional Composta.
    public class ResultadoEscolar {
        public static void main(String[] args) {
            int nota = 6;
        /**
         * Verificando se Nota é maior o igual a 7. Caso Verdadeiro imprime Aprovado caso Falso imprime Reprovado.
         * */
            if (nota >= 7 ){
                System.out.println("Aprovado!");
            }else {
                System.out.println("Reprovado!");
            }
        }
    }

## Condicionais Encadeadas - Exemplo: ResultadoEscolarRecuperar
Está associado ao controle de fluxo condicional, não se limitando ao IF ou ELSE. Podendp ter mais outras condições.
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

## Condição Ternária - Exemplo: ResultadoEscolarTernario
Onde podemos aberviar o algoritimo condicional refatorando/simplicando em ima linha a condição IF seguindo exemplo da Condicional Simples.
    public class ResultadoEscolarTernario {
        public static void main(String[] args) {
            int nota = 6;
            /**
            * Verificando se Nota é maior o igual a 7. Caso Verdadeiro imprime Aprovado caso Falso imprime Reprovado.
            * Em um acondição Ternária. Simpels
            * */
            String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

            System.out.println(resultado);
        }
    }

## Condição Switch Case - Exemplo: SistemaDeMedida
A estrutura Switch verifica cada caso se verdadeiro. Quando encontrado executação a instrução e utiliza o Break para sair da execução.
Exemplo abaixo de uma condição usando o Switch Case.
    public class SistemaDeMedida {
        public static void main(String[] args) {
            String sigla = "A";

            switch (sigla){
                case "P":
                    System.out.println("PEQUENO");
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

# Estrutura De Repeticao com Java (Projeto - EstruturaDeRepeticao_Java)
Laços de repetição ou laços de interação ou simplesmente loop, são comandos que permitem interação em um bloco diversas vezes até atingir a condição verdadeira.
* For (Para)
* While (Enquanto)
* Do While (Faça Enquanto)

## FOR - Exemplo: AboutFor 
Permite que uma variavel contadora seja testada a cada interação, sendo verdadeira incrementada ou decrementada a cada interação.
    public class AboutFor {
        public static void main(String[] args) throws InterruptedException {
            /**
            * Exemplo de interação do for, onde o valor de i=0, enquanto i for menor ou igual a 10, executa o loop de incremento i++.
            * */
            for (int i = 0; i <= 10; i++){
                Thread.sleep(700);
                System.out.println("Contando "+i);
            }

        }
    }

## FOR em ARRAY - Exemplo: AboutForInArray
Exemplo código abaixo autoexplicativo.

    public class AboutForInArray {
        public static void main(String[] args) {
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

## BREAK e CONTINUE - Exemplo: BreakContinue
Breake significa quebrar, parar, frear. Continue continua o laço.

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


## WHILE - Exemplo: AboutWhile
Determina que enquanto uma conição for válida, o bloco de código será executado. Sempre executando a verificação da condição, caso seja falsa a mesma não prosseguirá.

    public class AboutWhile {
        public static void main(String[] args) {
            double mesada = 50.0;

            while (mesada > 0){
                Double valorDoce = valorAleatorio();
                if (valorDoce > mesada){
                    valorDoce = mesada;
                }
                System.out.println("Doce do valor: "+valorDoce+" Adicionado ao carrinho.");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada: "+mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces.");
        }

        public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble();
        }
    }

## DO WHILE - Exemplo: AboutDoWhile
Considera que enquanto uma codição for válida, executa o código. Entretanto a condição somente é testada após executar o código.

    public class AboutDoWhile {
        public static void main(String[] args) {
            System.out.println("Discando. . . ");

            do {
                System.out.println("Telefone tocando.");
            }while (tocando());

            System.out.println("Alô!");
        
        }

        private static boolean tocando(){
            boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu? "+atendeu);
            return !atendeu;
        }
    }


# Tratamento de Exceções com Java (Exceções)
Ao executar o código Java, diferentes erro podem acontecer: erros de codificação feito pelo programador, errodevido a entrada ou imprevistos.

## Try Catch - Exemplo: AboutMe
Apresentação de um tratamento de exceções abaixo.

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


## jHierarquia das Exceções e excções customizadas - Exemplo: FormatadorCepExemplo

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

# Desafio de Projeto - DesafioControleDeFluxo
Ver no GitHub

# Fundamentos da Programação Orientada a Objetos com Java

## Calsses
São contidas pelo Identificador, Caracteristicas e Comportamentos
* model: Classes que represetam a camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuário.
* repository: Classes ou interfaces que possuem a finalizadade de interagir com tabelas no bando de dados: ClienteRepository
* service: Classes que contém regras de negócio do sistema: ClienteService possui o método validar o CPF do cliente cadastrado.
* controller: Callses que possuem a finalidade de disponibilizar os nosso recurso da aplicação para outras aplicações via padrão http
* view: Classes que possuem alguma interação com a interface gráfica acessada pelo ususário.
* util: Pacote que contém classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil

## Pacotes

## Visibilidade dos Recursos

## Modificadores de Acesso

1. Modificador "public": Método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.
2. 

## Getter e Setters

## Construtores

## Enums
Trata eventos que raramente sofrerá alteração em sua lista. Como por exemplo estados Brasileiro, Estado Civil, etc
Não confundir contantes com enum. Um enum é um conjunto de objetos pré-definidos na aplicação.
Os diagramas tem dois comportamentos, os Estruturais e os Comportamental

* Diagrama Estrutural - Diagrama De Classe: 
* Diagrama Estrutural - Diagrama De Objetos: 

## UML - Linguagem de Modelagem Unificada
Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica de um projeto.

### Diagramas, Elementos e Relacionamentos.

# Pilares da Programação Orientada a Objetos Java

## Pilares da POO (Programação Oerientada a Objetos)
Baseado no conceito de objetos que podem conter dados na forma de campo, também conhecidos como atributos, e códigos, na forma de procedimento, tamb´me conhecidos como métodos.
Se trata de um contexto análogo ao mundo real , tudo no qual nos referimos são objetos.

# Encapsulamento: 
Nem tudo precisa estar visível, grande parte do nosso algoritimo pode ser distribuido em métodos com finalidades específicas que complementa uma ação em nossa aplicação.
# Herança:
Carateristicas e comportamentos comuns podem ser elevados e compartilhados através de uma hoerarquia de objetos.
# Abstração:
É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
# Polimorfismo:
São inúmeras as maneiras de se realizar uma mesma ação 
# Interface



# Conhecendo Collections Java - Collection Framework API

