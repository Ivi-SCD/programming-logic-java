import java.util.Scanner;

public class MediaDasCincoNotas {
    public static void main(String[] args) {
        int [] notas = new int[5];
        double soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informa a nota numero (" + (i+1) + "): ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }

        System.out.println("Media dos numeros:s " + (soma/notas.length));
        sc.close();
    }
}
