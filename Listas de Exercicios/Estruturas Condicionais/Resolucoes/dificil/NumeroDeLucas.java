package dificil;

import java.util.Scanner;

public class NumeroDeLucas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre um numero para verificarmos se eh um numero de Lucas: ");
        int n = sc.nextInt();
        if (isLucas(n)) {
            System.out.println(n + " eh um numero de Lucas.");
        } else {
            System.out.println(n + " nao eh um numero de Lucas.");
        }
    }

    public static boolean isLucas(int n) {
        int a = 2, b = 1, c = 0;
        if (n == 2 || n == 1) {
            return true;
        }
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
}
