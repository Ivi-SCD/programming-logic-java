package medio;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int raizQuadrada = (int) Math.sqrt(numero);

        if (raizQuadrada * raizQuadrada == numero) {
            System.out.println("O número é quadrado perfeito.");
        } else {
            System.out.println("O número não é quadrado perfeito.");
        }

        sc.close();
    }
}
