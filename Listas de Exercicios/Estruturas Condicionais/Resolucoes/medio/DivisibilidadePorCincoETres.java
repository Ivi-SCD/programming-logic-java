package medio;

import java.util.Scanner;

public class DivisibilidadePorCincoETres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " é divisível por 3 e por 5");
        } else {
            System.out.println(num + " não é divisível por 3 e por 5");
        }

        sc.close();
    }
}
