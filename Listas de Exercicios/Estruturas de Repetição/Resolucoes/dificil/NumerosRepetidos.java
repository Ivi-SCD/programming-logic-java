import java.util.Scanner;

public class NumerosRepetidos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência: ");
        int n = sc.nextInt();

        System.out.println("Digite a sequência de números:");
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        boolean temRepeticao = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    temRepeticao = true;
                    break;
                }
            }
            if (temRepeticao) {
                break;
            }
        }

        if (temRepeticao) {
            System.out.println("A sequência contém números repetidos.");
        } else {
            System.out.println("A sequência não contém números repetidos.");
        }

        sc.close();
    }
}
