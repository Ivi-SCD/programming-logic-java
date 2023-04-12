import java.util.Scanner;

public class MatrizParaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
    
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();
    
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
            System.out.print("Digite o elemento da posição [" + i + "," + j + "]: ");
            matriz[i][j] = sc.nextInt();
          }
        }
    
        System.out.println("Matriz informada:");
        for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
            System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
        }
    
        System.out.println("Matriz transposta:");
        for (int i = 0; i < colunas; i++) {
          for (int j = 0; j < linhas; j++) {
            System.out.print(matriz[j][i] + " ");
          }
          System.out.println();
        }
    
        sc.close();
    }
}
