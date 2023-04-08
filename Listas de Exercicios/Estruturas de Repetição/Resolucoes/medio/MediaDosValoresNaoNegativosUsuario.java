import java.util.Scanner;

public class MediaDosValoresNaoNegativosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite um número (ou digite um número negativo para parar): ");
            double numero = sc.nextDouble();
            if (numero < 0) {
                continuar = false;
            } else {
                soma += numero;
                contador++;
            }
        }
        
        double media = soma / contador;
        System.out.println("A média dos números positivos digitados é: " + media);
        sc.close();
    }
}
