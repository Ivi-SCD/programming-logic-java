import java.util.Scanner;

public class NumerosComMaisFrequencia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros a ser digitado: ");
        int n = sc.nextInt();
        
        System.out.println("Digite a sequencia de numeros: ");

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Encontra o número com mais ocorrências
        int numeroMaisFrequente = -1;
        int maiorFrequencia = 0;
        for (int i = 0; i < n; i++) {
            int numero = numeros[i];
            int frequencia = 0;
            for (int j = i; j < n; j++) {
                if (numeros[j] == numero) {
                    frequencia++;
                }
            }
            if (frequencia > maiorFrequencia) {
                numeroMaisFrequente = numero;
                maiorFrequencia = frequencia;
            }
        }

        System.out.println("O número mais frequente é o " + numeroMaisFrequente +
            ", que aparece " + maiorFrequencia + " vezes.");

        sc.close();
    }
}
