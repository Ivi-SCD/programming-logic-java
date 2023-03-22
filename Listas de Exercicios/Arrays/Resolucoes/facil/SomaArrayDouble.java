package facil;

import java.util.Arrays;

public class SomaArrayDouble {
    public static void main(String[] args) {
        double[] arrayDouble = new double[4];
        Arrays.fill(arrayDouble, 4);

        double soma = 0;
        for (double d:
             arrayDouble) {
            soma += d;
        }

        System.out.println("A soma eh: " + soma);
    }
}
