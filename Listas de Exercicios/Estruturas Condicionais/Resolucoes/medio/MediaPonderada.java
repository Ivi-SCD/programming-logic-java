package medio;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double mediaPonderada = (num1 * 2 + num2 * 3 + num3 * 5) / 10;

        System.out.println("Média ponderada: " + mediaPonderada);
        sc.close();
    }
}
