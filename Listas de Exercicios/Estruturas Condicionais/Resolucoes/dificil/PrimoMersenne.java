package dificil;

import java.util.Scanner;

public class PrimoMersenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (isMersennePrime(n)) {
            System.out.println(n + " é um número primo de Mersenne.");
        } else {
            System.out.println(n + " não é um número primo de Mersenne.");
        }

        sc.close();
    }

    public static boolean isMersennePrime(int n) {
        int mersenne = (int) Math.pow(2, n) - 1;
        return isPrime(n) && isPrime(mersenne);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
