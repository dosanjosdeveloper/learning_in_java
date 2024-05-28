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

# Agora Valendo
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

