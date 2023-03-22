package medio;

import java.util.Random;

public class ValorMaximoNoArray {
    public static void main(String[] args) {
        int maior = 0;
        int [] arrayNumerosAleatorios = new int[10];
        
        Random rd = new Random(System.currentTimeMillis());

        for (int i: arrayNumerosAleatorios) {
            arrayNumerosAleatorios[i] = rd.nextInt();
            if(arrayNumerosAleatorios[i] > maior) {
                maior = arrayNumerosAleatorios[i];
            }
        }

        System.out.println("Mair numero: " + maior);
        
    }
}
