package facil;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println(num + " é um número positivo.");
        } else if (num < 0) {
            System.out.println(num + " é um número negativo.");
        } else {
            System.out.println(num + " é zero.");
        }
        sc.close();
    }
}
