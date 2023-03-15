package dificil;

import java.util.Scanner;

public class FatoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();


        System.out.print("Fatores primos de " + n + ": ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        sc.close();
    }
}

