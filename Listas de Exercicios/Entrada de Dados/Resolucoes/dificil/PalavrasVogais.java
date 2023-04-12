import java.util.Scanner;

public class PalavrasVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int count = 0;

        for (String palavra : frase.split(" ")) {
            char primeiraLetra = palavra.charAt(0);
            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
                count++;
            }
        }

        System.out.printf("A frase tem %d palavra(s) que começa(m) com uma vogal.\n", count);
    
        sc.close();
    }
}
