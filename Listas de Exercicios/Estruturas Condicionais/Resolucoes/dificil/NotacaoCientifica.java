package dificil;

import java.util.Scanner;

public class NotacaoCientifica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();


        int exponent = 0;
        while (Math.abs(num) >= 10) {
            num /= 10;
            exponent++;
        }
        while (Math.abs(num) < 1) {
            num *= 10;
            exponent--;
        }

        System.out.printf("%f x 10^%d", num, exponent);
        sc.close();
    }
}
