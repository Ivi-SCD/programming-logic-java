package dificil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetornaNovoArraySomaOriginais {
    public static void main(String[] args) {
        int [] arrayNumeros = {1, 2, 3, 4, 10, 3, 7};

        System.out.println(Arrays.toString(somaNumerosAnteriores(arrayNumeros)));
    }

    public static int[] somaNumerosAnteriores(int[] array) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int soma = 0;
            for (int j = 0; j < i; j++) {
                soma += array[j];
            }
            if (soma == array[i]) {
                lista.add(array[i]);
            }
        }

        int[] resultado = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;
    }

}
