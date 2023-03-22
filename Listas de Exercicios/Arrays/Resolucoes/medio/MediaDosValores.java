package medio;

import java.util.Locale;

public class MediaDosValores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] numeros = {2.5, 4.0, 3.5, 6.0, 1.5, 7.5, 8.0};
        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;
        System.out.printf("A media dos números eh: %.2f", media);

    }
}
