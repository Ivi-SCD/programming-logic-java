package medio;

import java.util.Scanner;

public class NumeroDaSorte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 100: ");
        int numero = sc.nextInt();

        if (numero % 7 == 0) {
            System.out.println(numero + " é um número da sorte!");
        } else {
            System.out.println(numero + " não é um número da sorte!");
        }
        sc.close();
    }
}

