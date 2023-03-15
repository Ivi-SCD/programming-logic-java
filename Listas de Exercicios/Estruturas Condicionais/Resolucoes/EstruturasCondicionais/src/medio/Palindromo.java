package medio;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println(original + " é um número palíndromo!");
        } else {
            System.out.println(original + " não é um número palíndromo!");
        }
        sc.close();
    }
}
