package facil;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
