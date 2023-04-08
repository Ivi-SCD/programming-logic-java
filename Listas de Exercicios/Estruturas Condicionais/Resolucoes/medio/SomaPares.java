package medio;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + soma);

        sc.close();
    }
}

