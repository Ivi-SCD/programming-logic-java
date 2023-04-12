import java.util.Scanner;

public class SomaDosDigitos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência: ");
        int n = sc.nextInt();

        System.out.println("Digite a sequência de números:");
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int numero = numeros[i];
            int somaDigitos = 0;
            while (numero > 0) {
                somaDigitos += numero % 10;
                numero /= 10;
            }
            System.out.println("A soma dos dígitos do número " + numeros[i] + " é " + somaDigitos);
        }

        sc.close();
    }
}
