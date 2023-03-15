package dificil;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta < 0) {
            System.out.println("Não há raízes reais para a equação.");
        } else if (delta == 0) {
            double raiz = -b / (2*a);
            System.out.println("A raiz da equação eh: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
        }

        sc.close();
    }
}
