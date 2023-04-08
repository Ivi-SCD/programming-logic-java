package facil;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
        sc.close();
    }
}
