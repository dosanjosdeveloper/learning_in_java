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