## Lógica de Programação :computer:
#### Opa Galera! To criando esse repositório pra ajudar vocês na cadeira de **Lógica de Programação** :computer:.
Sei que muitos de vocês estão começando agora no mundo da programação e podem estar enfrentando
algumas dificuldades para entender os conceitos fundamentais. A lógica da programação é **essencial** pra
todo programador, independente da linguagem ou ferramenta utilizada e envolve desde a compreensão de como
os computadores funcionam até a interpretação dos mesmos para as informações.

Vou tentar com o decorrer do período subir neste repositório
algumas listas de exercícios sobre determinados assuntos trabalhado em sala tal como sua resolução
e outros materiais de estudo, qualquer dúvida vocês podem falar comigo pelo
meu [Whatsapp (Apenas clicar aqui que você será redirecionado ao meu número).](https://api.whatsapp.com/send?phone=5581997053349&text=Ol%C3%A1%20Ivisson!%20Estava%20olhando%20seu%20perfil%20no%20github%20e%20gostaria%20de%20entrar%20em%20contato!!%20%F0%9F%98%80)

*Você pode selecionar aqui determinado tópico que você deseja ver:*
* 
*
*
*

## Vamos lá, Mão na massa!
Primeiro vamos começar falando sobre a própria linguagem que será utilizada em sala a linguagem Java, 
ela é uma linguagem de programação Orientada a Objetos, criada pela Sun Microsystems e atualmente mantida pela Oracle Corporation. 
Ela foi lançada em 1995 e se tornou uma das linguagens de programação mais populares do mundo.

### Instalação
Para começar a programar em Java você precisa baixar o [JDK](https://www.oracle.com/br/java/technologies/downloads/) (Java Development Kit) da Oracle. O JDK inclui o compilador Java,
que permite transformar seu código em bytecode, que pode ser executado na JVM (Java Virtual Machine). Após instalar o JDK podemos instalar a nossa IDE (Integrated Development Environment ou Ambiente de Desenvolvimento Integrado),
no nosso caso estaremos usando o [Eclipse](https://www.eclipse.org/downloads/), mas existem outras opções como o Netbeans ou o IntelliJ. Resumindo, os passos seriam estes:
* Baixar o [JDK](https://www.oracle.com/br/java/technologies/downloads/)
* Baixar e Instalar a [IDE](https://www.eclipse.org/downloads/)
* Começar a programar!

### Sintaxe Básica
Segue abaixo um exemplo de um programa "Hello, World!" em Java:
```java
public class HelloWorld {
  public static void main(String [] args) {
      System.out.println("Hello, World!");
   }
}
```

Simples e fácil, concorda? Iremos explorar agora alguma características da linguagem, 
a medida que o curso for passando vocês compreenderam mais palavra e sintaxe do código java,
a melhor maneira de ir aprendendo a sintaxe por enquanto é fazer diversos programas, mesmo que simples
para seu cérebro começar a ir memorizando algumas etapas e com o tempo isso vai se tornar algo automático.

### Tipos de Dados
Java tem diversos tipos de dados que podem ser divididos em dois grupos:
primitivos e de referência. Os tipos de dados primitivos são aqueles que armazenam
valores simples, como números inteiros, números de ponto flutuante e caractere. Já os
tipos de dados de referência armazenam referências a objetos. Vamos focar nos tipos primitivos
que são os que mais vão ser trabalhados em sala. Veja a seguir:

|Tipo|Tamanho|
|---|---
|byte|8 bits|
|short|16 bits|
|int|32 bits|
|long|64 bits|
|float|32 bits|
|Double (Tipo Referência)|64 bits|
|char|16 bits|
|boolean|8 bits|

Essa tabela deve ter assustado um pouco mas é super simples de entender,
os tipos que armazenam números inteiros são os: (short, int e long) e quanto maior a quantidade de bits
maior será o valor que poderá ser armazenado neles, e os tipos que representam números com casas decimais são os:
(float e double) seguindo a mesma lógica. Já o tipo (char) serve para representar apenas caracteres como letras 
singulares ou apenas números e o tipo (boolean) serve para representar valores lógicos como true ou false, 0 ou 1.

Para declara uma variável em Java utilizamos a seguinte sintaxe:
```java
tipo nomeDaVariável;
```
Por exemplo, para declarar uma variável do tipo inteiro chamada idade, usamos o seguinte código:

```java
int idade;
```

Para atribuir um valor à variável, usamos o operador de atribuição `=` :

```java
  idade = 25;

```

Podemos também declarar e inicializar uma variável em uma única linha:

```java
int idade = 25;
float numeroDecimal = 2.4F;
long numeroLong = 2L;
Double numeroDouble = 2.5;
boolean tipoBooleano = true;
char tipoCaractere = 'Y';
```

### Operadores
|Operador|Descrição
|---|---
|+	|Adição
|-	|Subtração
|*	|Multiplicação
|/	|Divisão
|%	|Resto da divisão
|==	|Igualdade
|!=	|Diferença
|<	|Menor que
|>	|Maior que
|<=	|Menor ou igual a
|>=	|Maior ou igual a
|&&	|E lógico

Além destes operadores também temos o operador `||` que representa o OU lógico.

### Estruturas de Controle
As estruturas de controle são usadas geralmente para controlar o fluxo de execução do programa. As principais estruturas de controle em Java são:

#### Estrutura condicional `if`
A estrutura condicional if é usada para executar um bloco de código **se uma determinada condição for verdadeira**. A sintaxe é a seguinte:

```java
if (condicao) {
  // bloco de código a ser executado se a condição for verdadeira
}
```

Por exemplo:

```java
int idade = 20;
if (idade >= 18) {
  System.out.println("Você é maior de idade.");
}
```
Se a idade for igual ou superior a 18, a mensagem "Você é maior de idade." será exibida na tela.

#### Estrutura condicional `if-else`
A estrutura condicional if-else é usada para executar um bloco de código se uma determinada condição for verdadeira e outro bloco se a condição for falsa. A sintaxe é a seguinte:

```java
if (condicao) {
  // bloco de código a ser executado se a condição for verdadeira
} else {
  // bloco de código a ser executado se a condição for falsa
}
```

Por exemplo:

```java
int idade = 16;
if (idade >= 18) {
  System.out.println("Você é maior de idade.");
} else {
  System.out.println("Você é menor de idade.");
}
```

Se a idade for igual ou superior a 18, a mensagem "Você é maior de idade." será exibida na tela. Caso contrário, a mensagem "Você é menor de idade." será exibida.

#### Estrutura condicional `else-if`
A estrutura condicional else-if é usada para testar várias condições em sequência. A sintaxe é a seguinte:

```java
if (condicao1) {
  // bloco de código a ser executado se a condição1 for verdadeira
} else if (condicao2) {
  // bloco de código a ser executado se a condição2 for verdadeira
} else if (condicao3) {
  // bloco de código a ser executado se a condição3 for verdadeira
} else {
  // bloco de código a ser executado se nenhuma das condições anteriores for verdadeira
}
```
Por exemplo:

```java
int nota = 8;
if (nota >= 9) {
  System.out.println("Aprovado com nota A.");
} else if (nota >= 7) {
  System.out.println("Aprovado com nota B.");
} else if (nota >= 5) {
  System.out.println("Reprovado com nota C.");
} else {
  System.out.println("Reprovado com nota D.");
}
```
Neste exemplo, o programa verifica a nota do aluno e exibe uma mensagem correspondente de acordo com a nota.
