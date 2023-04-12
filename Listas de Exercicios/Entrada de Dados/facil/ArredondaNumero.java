import java.util.Scanner;

public class ArredondaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número decimal: ");
        double numero = sc.nextDouble();
        
        double arredondado = Math.round(numero * 100.0) / 100.0;
        
        System.out.println("O número arredondado é: " + arredondado);
    
        sc.close();
    }
}
