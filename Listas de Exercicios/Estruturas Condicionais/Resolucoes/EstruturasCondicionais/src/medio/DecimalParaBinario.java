package medio;

import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int decimal = sc.nextInt();

        int resto;
        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            resto = decimal % 2;
            binario.insert(0, resto);
            decimal /= 2;
        }

        System.out.println("O número em binário é: " + binario);

        sc.close();
    }
}

