package dificil;

import java.util.Scanner;

public class AvaliadorDeExpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a expressão matemática:");
        String expressao = sc.nextLine();

        expressao = expressao.replaceAll("\\s", "");

        String[] elementos = expressao.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        double[] numeros = new double[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            numeros[i] = Double.parseDouble(elementos[i]);
        }

        String[] operadores = new String[elementos.length/2];
        int j = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (i % 2 != 0) {
                operadores[j] = elementos[i];
                j++;
            }
        }

        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            switch (operadores[i - 1]) {
                case "+" -> resultado += numeros[i];
                case "-" -> resultado -= numeros[i];
                case "*" -> resultado *= numeros[i];
                case "/" -> resultado /= numeros[i];
            }
        }

        System.out.println("O resultado da expressão é: " + resultado);

        sc.close();
    }
}

