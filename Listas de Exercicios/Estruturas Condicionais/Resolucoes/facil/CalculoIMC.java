package facil;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double peso = sc.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else {
            System.out.println("Acima do peso");
        }

        sc.close();
    }
}
