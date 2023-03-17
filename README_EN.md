## Programming Logic :computer:
#### Oops Guys! I'm creating this repository to help you in the subject of **Programming Logic** :computer:.
I know that many of you are just starting out in the world of programming and may be facing
some difficulties in understanding the fundamental concepts. Programming logic is **essential** to
every programmer, regardless of the language or tool used, and involves from understanding how
computers work until their interpretation of information.

I will try with the passage of time to upload to this repository
some lists of exercises on certain subjects worked on in the classroom as well as their resolution
and other study materials, any questions you can talk to me at
my email.

*You can select here certain topic you want to see:*
* [Installation](#installation)
* [Basic Syntax](#syntax)
* [Datatypes](#datatypes)
* [Operators](#operators)
* [Control Structures](#controlstructures)
* [One-Dimensional Arrays (Vectors)](#arrays)

*Exercise Lists:* (To check the answers enter the resolutions directory in the src folder right after and select the difficulty, then look for the class that best fits the question, for example, question number 1 on the hard difficulty in .txt file is the question involving Mersenne numbers, so your class will be NumerosMersenne)
* [Conditional Structures](https://github.com/Ivi-SCD/Logica-da-Programacao-1P/tree/main/Listas%20de%20Exercicios/Estrutturas%20Condicionais)
* [Arrays](https://github.com/Ivi-SCD/Logica-da-Programacao-1P/tree/main/Listas%20de%20Exercicios/Arrays)

## Come on, Hands-on!
First let's start talking about the language itself that will be used in the room the Java language,
it is an Object Oriented programming language created by Sun Microsystems and currently maintained by Oracle Corporation.
It was released in 1995 and has become one of the most popular programming languages in the world.

### <a name="installation"> Installation </a>
To start programming in Java you need to download the [JDK](https://www.oracle.com/br/java/technologies/downloads/) (Java Development Kit) from Oracle. The JDK includes the Java compiler,
which allows you to transform your code into bytecode, which can be executed in the JVM (Java Virtual Machine). After installing the JDK we can install our IDE (Integrated Development Environment or Integrated Development Environment),
in our case we will be using [Eclipse](https://www.eclipse.org/downloads/), but there are other options like Netbeans or IntelliJ. In short, the steps would be these:
* Download the [JDK](https://www.oracle.com/br/java/technologies/downloads/)
* Download and Install the [IDE](https://www.eclipse.org/downloads/)
* Start programming!

##

### <a name="syntax"> Basic Syntax </a>
Below is an example of a "Hello, World!" in Java:
```java
public class HelloWorld {
   public static void main(String [] args) {
       System.out.println("Hello, World!");
    }
}
```

Simple and easy, do you agree? We will now explore some features of the language,
as the course went on, you understood more the words and syntax of java code,
the best way to learn the syntax for now is to make several programs, even simple ones
for your brain to start memorizing some steps and over time this will become something automatic.

##

### Simple Tutorial on How to Create a Project in Eclipse
1. Download and install Eclipse: Eclipse can be downloaded for free from the [official website](https://www.eclipse.org/downloads/).
Simply choose the appropriate version for your operating system and follow the installation instructions.

2. Create a new project: Open Eclipse and click "File" in the main menu.
Then select "New" and "Java Project". Enter a name for the project and click "Finish".

3. Create a new class: In the Package Explorer (left panel), right-click
mouse click on the name of the project you just created. Select "New" and "Class".
Enter a name for the class and click "Finish"
* Obs: Don't forget to mark the "static void main".

4. Write the code: In the main Eclipse window, you will see a blank text editor.
This is where you'll write the Java code for your class.

5. Run the code: To run the code, right-click on the class
that you just created in the Package Explorer. Select "Run As" and "Java Application".
So voila! The Eclipse console will display the output of your program.

##

### <a name="datatypes">Data Types </a>
Java has several data types that can be divided into two groups:
primitives and the Wrapper Classes. The primit data types ives are those who store
simple values such as integers, floating point numbers, and characters. Wrapper Classes store references to objects. Let's focus on primitive types
which are the ones that will be worked on the most in the classroom. See below:

|Type|Size|Wrapper Class|
|---|---|---
|byte|8 bits|Byte
|short|16 bit|short
|int|32 bits|Integer
|long|64bit|long
|float|32bit|float
|double|64-bit|Double
|char|16 bits|Character
|boolean|1 bits|Boolean

This table must have scared you a little but it is super simple to understand, basically it contains the type, size
(maximum value we can assign to it) and its Wrapper Class representation.
The types that store integer numbers are: (short, int and long) and the greater the number of bits
the greater the value that can be stored in them, and the types that represent numbers with decimal places are:
(float and double) following the same logic. The type (char) serves to represent only characters such as letters
singular or just numbers and the type (boolean) serves to represent logical values such as true or false, 0 or 1.

##

To declare a variable in Java we use the following syntax:
```java
type variablename;
```
For example, to declare an integer variable called age, we use the following code:

```java
int age;
```

To assign a value to the variable, we use the `=` assignment operator:

```java
   age = 25;

```

We can also declare and initialize a variable in a single line:

```java
int age = 25;
float numDecimal = 2.4F;
long numberLong = 2L;
Double numberDouble = 2.5;
boolean booleanType = true;
char characterType = 'Y';
```
##

### <a name="operators"> Operators </a>
We can also perform mathematical operations and
logics in our Java code, here is a table with the main operators:

| Operator | Description
|---|---
|+ |Addition
|- |Subtraction
|* |Multiplication
|/ | Division
|% |Remainder of division
|== |Equality
|!= |difference
|< |less than
|> |Greater than
|<= |Less than or equal to
|>= |Greater than or equal to
|&& |And logical

In addition to these operators, we also have the `||` operator that represents the logical OR.

##

### <a name="controlstructures"> Control Structures </a>
Control structures are generally used to control the flow of program execution. The main control structures in Java are:

#### `if` conditional structure
The conditional if structure is used to execute a block of code **if a given condition is true**. The syntax is as follows:

```java
if (condition) {
   // block of code to be executed if condition is true
}
```

For example:

```java
int age = 20;
if (age >= 18) {
   System.out.println("You are of legal age.");
}
```
If the age is 18 or over, the message "You are of legal age." will be displayed on the screen.

##

#### `if-else` conditional structure
The if-else conditional structure is used to execute a block of code if a given condition is true and another block if the condition is false. The syntax is as follows:

```java
if (condition) {
   // block of code to be executed if condition is true
} else {
   // block of code to be executed if the condition is false
}
```

For example:

```java
int age = 16;
if (age >= 18) {
   System.out.println("You are of legal age.");
} else {
   System.out.println("You are underage.");
}
```

If the age is 18 or over, the message "You are of legal age." will be displayed on the screen. Otherwise, the message "You are underage." will be displayed.

##

#### `else-if` conditional structure
The else-if conditional structure is used to test multiple conditions in sequence. The syntax is as follows:

```java
if (condition1) {
   // block of code to be executed if condition1 is true
} else if (condition2) {
   // block of code to be executed if condition2 is true
} else if (condition3) {
   // block of code to be executed if condition3 is true
} else {
   // block of code to be executed if none of the previous conditions are true
}
```
For example:

```java
int grade = 8;
if (grade >= 9) {
   System.out.println("Approved with grade A.");
} else if (grade >= 7) {
   System.out.println("Approved with grade B.");
} else if (grade >= 5) {
   System.out.println("Failed with grade C.");
} else {
   System.out.println("Failed with grade D.");
}
```
In this example, the program checks the student's grade and displays a corresponding message according to the grade.

##

#### `Ternary conditional` structure

The ternary conditional structure is a much shorter way of writing an 'if-else' conditional structure,
it can be used on several occasions and also helps to make the code visibly cleaner, follows its structure:.

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

Here is an actual example:
```java
public static void main(String [] args) {
     int productValue = 100;
    
     float discount = (valuePproduct > 50) ? 0.5F: 0.1F;
    
     int finalvalue = 100*discount;
}
```
##

#### `while` looping structure
The `while` loop structure allows you to execute a block of code repeatedly as long as a condition is true. The syntax is as follows:

```java
while (condition) {
   // code block
}
```

The code block will be executed repeatedly as long as the specified condition is true.
If the condition is false on the first check, the block of code will not be executed.

An example use of while is reading data from a user, where the program prompts the user to enter a value and checks that the entry is correct before continuing:

```java
import java.util.Scanner;

public class ExampleWhile {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int number = 0;
        
         while (number <= 0) {
             System.out.print("Enter a positive number: ");
             number = scanner.nextInt();
         }
        
         System.out.println("The number entered was: " + number);
         scanner.close();
     }
}
```

In this example, the program prompts the user to enter a positive number.
As long as the number entered is not positive, the program will continue prompting the user to enter a number.

##

#### `for` loop structure
The `for` loop structure is a loop structure that executes a block of code a specified number of times. The `for` syntax in Java is as follows:

```java
for (initialization; condition; increment) {
   // code block
}
```

Initialization is performed only once at the beginning of the loop, the condition is checked every iteration, and if true,
the block of code is executed. After each iteration, the increment is performed. For example, the code below prints the numbers 1 to 5 using a for:

```java
Copy code
for (int i = 1; i <= 5; i++) {
   System.out.println(i);
}
```

In this example, the variable `i` is initialized with the value 1, the condition `i <= 5` is checked at each iteration and, if true, the block of code inside the braces is executed, printing the value of `i `. After each iteration, `i` is incremented by 1. The result will be the same as the previous example:

```bash
1
two
3
4
5
```

##

#### `do-while` loop structure

The `do-while` expression is a repetition structure in Java that is similar to `while`, but with the difference that the block of code inside the braces
is executed at least once, regardless of whether the condition is true or false.

The do-while syntax in Java is as follows:

```java
of {
   // code block
} while (condition);
```

The block of code inside the curly braces is executed first, before even checking the condition. Then the condition is checked. If the condition is true, the block of code is executed again and the process repeats. If the condition is false, the loop terminates and execution continues as normal.

The main difference between `do-while` and `while` is that `do-while` guarantees that the block of code is executed at least once,
while the `while` can skip the execution of the code block if the condition is already false at the beginning.

For example, the code below prints the numbers 1 to 5 using a do-while:

```java
int i = 1;
of {
   System.out.println(i);
   i++;
} while (i <= 5);
```

In this example, the block of code inside the braces is executed first, printing the value of `i` and incrementing it by 1 on each iteration. Then the condition `i <= 5` is checked. Since `i` is still less than or equal to 5, the block of code is executed again. The process is repeated until `i` is greater than 5. The result will be:

```bash
1
two
3
4
5
```

It is important to note that the `i` variable is initialized before the `do-while` loop, as it needs to have a value before being used in the code block.

### <a name="arrays"> Arrays or One-Dimensional Vectors </a>

Arrays in Java are objects that store **a collection of elements of the same type in a single variable**. Elements are accessed through an index that starts at 0 and goes up to the size of the array minus 1 (That is, when an Array has size 5, its index goes up to [5-1]).

The declaration and creation of an array in Java follows the following syntax:

```java
arrayType[] arrayName = new arrayType[arraySize];
```

In this example `arrayType` represents the type of data that the array will store, `arrayName` is the name
we give to this array and `arraySize` is the number of elements this array will store.

An array can also be initialized during its creation, as in the example below:

```java
int[] numbers = {10, 20, 30, 40, 50}
```

We can also initialize an array with a size and assign values
to its elements using a for loop, as in the example below:

```java
int[] numbers = new int[5];
for (int i = 0; i < numbers.length; i++) {
     numbers[i] = i * 10;
}
```

Also, the length of an array can be obtained using the proplength length,
as shown in the example below:

```java
int size = numbers.length;
```

The elements of an array can be accessed through an `index`, as we will see below:


```java
int value = numbers[1];
```

We can also iterate over the elements of an array using a for loop, as shown in the example below:

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
     System.out.println(numbers[i]);
}
```

We can also use a foreach loop, which iterates over all elements of an array in order,
as shown in the following example:

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int number : numbers) {
     System.out.println(number);
}
```

The use of arrays in Java is quite common and useful in many situations.
However, it is important to be careful when working with arrays to avoid
exceptions such as IndexOutOfBounds (An error that occurs when we try to
accessing an element that exceeds the maximum size of the array or on some other occasions involving
your index).
