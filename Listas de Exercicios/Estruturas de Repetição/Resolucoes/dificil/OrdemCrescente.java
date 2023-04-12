import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência: ");
        int n = sc.nextInt();

        System.out.println("Digite a sequência de números:");
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        boolean emOrdem = true;
        for (int i = 0; i < n - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                emOrdem = false;
                break;
            }
        }

        if (emOrdem) {
            System.out.println("A sequência está em ordem crescente.");
        } else {
            System.out.println("A sequência não está em ordem crescente.");
        }

        sc.close();
    }
}