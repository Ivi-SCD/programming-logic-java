package medio;

import java.util.Scanner;


public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " é um número de Armstrong.");
        } else {
            System.out.println(number + " não é um número de Armstrong.");
        }

        sc.close();
    }
}

