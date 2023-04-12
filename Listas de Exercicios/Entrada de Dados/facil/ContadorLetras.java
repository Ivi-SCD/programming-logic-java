import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        int quantidade = palavra.length();
        
        System.out.println("A palavra " + palavra + " tem " + quantidade + " letras.");
        
        sc.close();
    }
}
 