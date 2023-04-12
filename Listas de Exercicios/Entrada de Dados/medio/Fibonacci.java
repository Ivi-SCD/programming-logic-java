import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int anterior = 0;
        int atual = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        sc.close();
    }
}
