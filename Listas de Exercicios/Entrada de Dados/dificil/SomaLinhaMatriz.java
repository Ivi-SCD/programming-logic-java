import java.util.Scanner;

public class SomaLinhaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int numLinhas = sc.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int numColunas = sc.nextInt();

        int[][] matriz = new int[numLinhas][numColunas];

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.printf("Digite o elemento da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numLinhas; i++) {
            int soma = 0;
            for (int j = 0; j < numColunas; j++) {
                soma += matriz[i][j];
            }
            System.out.printf("A soma da linha %d é: %d\n", i, soma);
        }

        sc.close();
    }
}
