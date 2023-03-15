package medio;

import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 12, 1, 2 -> System.out.println("Inverno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verão");
            case 9, 10, 11 -> System.out.println("Outono");
            default -> System.out.println("Mês inválido");
        }

        sc.close();
    }
}
