package medio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;

        System.out.print("Sequência de Fibonacci até " + n + ": ");
        while (c <= n) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
