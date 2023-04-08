import java.util.Scanner;

public class MenorEMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];

        int maiorVal = 0;
        int menorVal = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o numero (" + (i+1) + "): ");
            array[i] = sc.nextInt();

            if(i == 0) {
                maiorVal = array[i]; 
                menorVal = array[i];
            } else {
                if(array[i] > maiorVal) {
                    maiorVal = array[i];
                } else if(array[i] < menorVal) {
                    menorVal = array[i];
                }
            }
        }

        System.out.println("Menor valor digitado: " + menorVal + "\nMaior valor digitado: " + maiorVal);

        sc.close();
    }
}
