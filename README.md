## Lógica de Programação :computer:
#### Opa Galera! To criando esse repositório pra ajudar vocês na cadeira de **Lógica de Programação** :computer:.
Sei que muitos de vocês estão começando agora no mundo da programação e podem estar enfrentando
algumas dificuldades para entender os conceitos fundamentais. A lógica da programação é **essencial** pra
todo programador, independente da linguagem ou ferramenta utilizada e envolve desde a compreensão de como
os computadores funcionam até a interpretação dos mesmos para as informações.

Vou tentar com o decorrer do período subir neste repositório
algumas listas de exercícios sobre determinados assuntos trabalhado em sala tal como sua resolução
e outros materiais de estudo, qualquer dúvida vocês podem falar comigo pelo
meu [Whatsapp apenas clicando aqui.](https://api.whatsapp.com/send?phone=5581997053349&text=Ol%C3%A1%20Ivisson!%20Estava%20olhando%20seu%20perfil%20no%20github%20e%20gostaria%20de%20entrar%20em%20contato!!%20%F0%9F%98%80)

*Você pode selecionar aqui determinado tópico que você deseja ver:*
* [Instalação](#instalacao)
* [Sintaxe Básica](#sintaxe)
* [Tipos de dados](#datatypes)
* [Operadores](#operadores)
* [Estruturas de Controle](#estruturascontrole)

*Listas de Exercicios:* (Para verificar as respostas entre no diretório de resoluções na pasta src logo após e selecione a dificuldade, em seguida procure a classe que mais se adepta a questão, por exemplo, a questão de número 1 na dificuldade díficil no arquivo .txt é a questão que envolve números de Mersenne, logo, sua classe será a NumerosMersenne)
* [Estruturas Condicionais](https://github.com/Ivi-SCD/Logica-da-Programacao-1P/tree/main/Listas%20de%20Exercicios/Estruturas%20Condicionais)

## Vamos lá, Mão na massa!
Primeiro vamos começar falando sobre a própria linguagem que será utilizada em sala a linguagem Java, 
ela é uma linguagem de programação Orientada a Objetos, criada pela Sun Microsystems e atualmente mantida pela Oracle Corporation. 
Ela foi lançada em 1995 e se tornou uma das linguagens de programação mais populares do mundo.

### <a name= "instalacao"> Instalação </a>
Para começar a programar em Java você precisa baixar o [JDK](https://www.oracle.com/br/java/technologies/downloads/) (Java Development Kit) da Oracle. O JDK inclui o compilador Java,
que permite transformar seu código em bytecode, que pode ser executado na JVM (Java Virtual Machine). Após instalar o JDK podemos instalar a nossa IDE (Integrated Development Environment ou Ambiente de Desenvolvimento Integrado),
no nosso caso estaremos usando o [Eclipse](https://www.eclipse.org/downloads/), mas existem outras opções como o Netbeans ou o IntelliJ. Resumindo, os passos seriam estes:
* Baixar o [JDK](https://www.oracle.com/br/java/technologies/downloads/)
* Baixar e Instalar a [IDE](https://www.eclipse.org/downloads/)
* Começar a programar!

### <a name= "sintaxe"> Sintaxe Básica </a>
Segue abaixo um exemplo de um programa "Hello, World!" em Java:
```java
public class HelloWorld {
  public static void main(String [] args) {
      System.out.println("Hello, World!");
   }
}
```

Simples e fácil, concorda? Iremos explorar agora alguma características da linguagem, 
a medida que o curso for passando vocês compreenderam mais as palavras e sintaxe do código java,
a melhor maneira de ir aprendendo a sintaxe por enquanto é fazendo diversos programas, mesmo que simples
para seu cérebro começar a ir memorizando algumas etapas e com o tempo isso vai se tornar algo automático.

### Tutorial Simples de Como Criar um Projeto no Eclipse
1. Baixe e instale o Eclipse: O Eclipse pode ser baixado gratuitamente no [site oficial](https://www.eclipse.org/downloads/). 
Basta escolher a versão apropriada para o seu sistema operacional e seguir as instruções de instalação.

2. Crie um novo projeto: Abra o Eclipse e clique em "File" no menu principal. 
Em seguida, selecione "New" e "Java Project". Digite um nome para o projeto e clique em "Finish".

3. Crie uma nova classe: No Package Explorer (painel esquerdo), clique com o botão direito 
do mouse no nome do projeto que você acabou de criar. Selecione "New" e "Class". 
Digite um nome para a classe e clique em "Finish" 
* Obs: Não se esqueça de marcar o "static void main".

4. Escreva o código: Na janela principal do Eclipse, você verá um editor de texto em branco. 
É aqui que você escreverá o código Java para a sua classe.

5. Execute o código: Para executar o código, clique com o botão direito do mouse na classe 
que você acabou de criar no Package Explorer. Selecione "Run As" e "Java Application". 
Então voilá! O console do Eclipse exibirá a saída do seu programa.

### <a name= "datatypes"> Tipos de Dados </a>
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

Para declarar uma variável em Java utilizamos a seguinte sintaxe:
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

### <a name= "operadores"> Operadores </a>
Podemos também realizar operações matemáticas e 
lógicas no nosso código Java, segue uma tabela com os principais operadores:

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

### <a name= "estruturascontrole"> Estruturas de Controle </a>
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

##

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

##

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

##

#### Estrutura `condicional ternária`

A estrutura condicional ternária é uma forma bem mais reduzida de escrever uma estrutura condicional 'if-else',
ela pode ser utilizada em diversas ocasiões e também ajuda a tornar o código visivelmente mais limpo, segue a sua estrutura:.

```java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
```

Aqui está um exemplo real:
```java
public static void main(String [] args) {
    int valorProduto = 100;
    
    float desconto = (valorProduto > 50) ? 0.5F: 0.1F;
    
    int valorFinal = 100*desconto;
}
```
##

#### Estrutura de repetição  `while`
A estrutura de repetição `while` permite executar um bloco de código repetidamente enquanto uma condição for verdadeira. A sintaxe é a seguinte:

```java
while (condicao) {
  // bloco de codigo
}
```

O bloco de código será executado repetidamente enquanto a condição especificada for verdadeira. 
Se a condição for falsa na primeira verificação, o bloco de código não será executado.

Um exemplo de uso do while é a leitura de dados de um usuário, onde o programa pede que o usuário insira um valor e verifica se a entrada está correta antes de continuar:

```java
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        while (numero <= 0) {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();
        }
        
        System.out.println("O número digitado foi: " + numero);
        scanner.close();
    }
}
```

Neste exemplo, o programa solicita que o usuário digite um número positivo. 
Enquanto o número digitado não for positivo, o programa continuará solicitando que o usuário digite um número.

##

#### Estrutura de repetição  `for`
A estrutura de repetição `for` é uma estrutura de repetição que executa um bloco de código um número determinado de vezes. A sintaxe do `for` em Java é a seguinte:

```java
for (inicializacao; condicao; incremento) {
  // bloco de codigo
}
```

A inicialização é executada apenas uma vez no início do loop, a condição é verificada a cada iteração e, se for verdadeira, 
o bloco de código é executado. Após cada iteração, o incremento é executado. Por exemplo, o código abaixo imprime os números de 1 a 5 usando um for:

```java
Copy code
for (int i = 1; i <= 5; i++) {
  System.out.println(i);
}
```

Neste exemplo, a variável `i` é inicializada com o valor 1, a condição `i <= 5` é verificada a cada iteração e, se for verdadeira, o bloco de código dentro das chaves é executado, imprimindo o valor de `i`. Após cada iteração, `i` é incrementado em 1. O resultado será o mesmo que o exemplo anterior:

```bash
1
2
3
4
5
```

##

#### Estrutura de repetição `do-while`

A expressão `do-while` é uma estrutura de repetição em Java que é semelhante ao `while`, mas com a diferença de que o bloco de código dentro das chaves 
é executado pelo menos uma vez, independentemente da condição ser verdadeira ou falsa.

A sintaxe do do-while em Java é a seguinte:

```java
do {
  // bloco de codigo
} while (condicao);
```

O bloco de código dentro das chaves é executado primeiro, antes mesmo de verificar a condição. Depois, a condição é verificada. Se a condição for verdadeira, o bloco de código é executado novamente e o processo se repete. Se a condição for falsa, o loop termina e a execução continua normalmente.

A principal diferença entre o `do-while` e o `while` é que o `do-while` garante que o bloco de código seja executado pelo menos uma vez, 
enquanto o `while` pode pular a execução do bloco de código se a condição já for falsa no início.

Por exemplo, o código abaixo imprime os números de 1 a 5 usando um do-while:

```java
int i = 1;
do {
  System.out.println(i);
  i++;
} while (i <= 5);
```

Neste exemplo, o bloco de código dentro das chaves é executado primeiro, imprimindo o valor de `i` e incrementando-o em 1 a cada iteração. Depois, a condição `i <= 5` é verificada. Como `i` ainda é menor ou igual a 5, o bloco de código é executado novamente. O processo se repete até que `i` seja maior que 5. O resultado será:

```bash
1
2
3
4
5
```

É importante notar que a variável `i` é inicializada antes do loop `do-while`, pois ela precisa ter um valor antes de ser usada no bloco de código.
