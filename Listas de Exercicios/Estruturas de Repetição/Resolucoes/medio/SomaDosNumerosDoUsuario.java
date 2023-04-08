import java.util.Scanner;

public class SomaDosNumerosDoUsuario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite um número inteiro (ou 0 para parar): ");
            int numero = sc.nextInt();
            if (numero == 0) {
                continuar = false;
            } else {
                soma += numero;
            }
        }
        
        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
}
