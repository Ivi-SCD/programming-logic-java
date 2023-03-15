package facil;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        if (dia < 1 || dia > 7) {
            System.out.println("Dia inválido!");
        } else {
            System.out.println(dias[dia - 1]);
        }

        sc.close();
    }
}
