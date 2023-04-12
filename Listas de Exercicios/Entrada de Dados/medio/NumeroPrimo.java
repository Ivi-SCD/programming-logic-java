import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        boolean primo = true;
        
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                primo = false;
                break;
            }
        }
        
        if(primo) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }
        
        sc.close();
    }
}

