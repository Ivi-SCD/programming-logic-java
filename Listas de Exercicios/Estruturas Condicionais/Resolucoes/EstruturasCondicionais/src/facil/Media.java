package facil;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado! Sua média foi: " + media);
        } else {
            System.out.println("Reprovado! Sua média foi: " + media);
        }
        sc.close();
    }
}
