package dificil;

import java.util.Scanner;

public class PAouPG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números na sequência: ");
        int n = sc.nextInt();

        int[] sequencia = new int[n];
        System.out.print("Digite a sequência de números separados por espaço: ");
        for (int i = 0; i < n; i++) {
            sequencia[i] = sc.nextInt();
        }

        int razaoAritmetica = sequencia[1] - sequencia[0];
        double razaoGeometrica = (double) sequencia[1] / sequencia[0];
        boolean isAritmetica = true;
        boolean isGeometrica = true;

        for (int i = 1; i < n - 1; i++) {
            if (sequencia[i + 1] - sequencia[i] != razaoAritmetica) {
                isAritmetica = false;
            }

            if ((double) sequencia[i + 1] / sequencia[i] != razaoGeometrica) {
                isGeometrica = false;
            }
        }

        if (isAritmetica) {
            System.out.println("A sequência é uma progressão aritmética com razão " + razaoAritmetica + ".");
        } else if (isGeometrica) {
            System.out.println("A sequência é uma progressão geométrica com razão " + razaoGeometrica + ".");
        } else {
            System.out.println("A sequência não é uma progressão aritmética nem geométrica.");
        }

        sc.close();
    }
}
