import java.util.Scanner;

public class NumerosRacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite um número decimal: ");
        double num = sc.nextDouble();
    
        int[] numeradores = {-1, 0, 1};
        int[] denominadores = {1, 10, 100, 1000};
    
        System.out.print("Números racionais mais próximos de " + num + ": ");
        for (int i = 0; i < numeradores.length; i++) {
          for (int j = 0; j < denominadores.length; j++) {
            double racional = (double) numeradores[i] / denominadores[j];
            if (racional > num - 0.01 && racional < num + 0.01) {
              System.out.print(numeradores[i] + "/" + denominadores[j] + " ");
            }
          }
        }
    
        sc.close();
    }
}
