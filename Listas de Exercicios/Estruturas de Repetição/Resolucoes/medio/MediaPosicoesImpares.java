import java.util.Scanner;

public class MediaPosicoesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        
        System.out.print("Digite a quantidade de números da sequência: ");
        int quantidade = sc.nextInt();
        int[] numeros = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número da posição " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if ((i + 1) % 2 != 0) {
                soma += numeros[i];
                contador++;
            }
        }
        
        double media = soma / contador;
        System.out.println("A média dos números que estão nas posições ímpares é: " + media);
        sc.close();
    }
}
