package dificil;

import java.util.*;

public class RetornaNumeroDeVezesPar {
    public static void main(String[] args) {
        int [] arrayNumeros = {1, 2, 3, 4, 10, 10, 3, 7};

        System.out.println(Arrays.toString(elementosPares(arrayNumeros)));
    }

    public static int[] elementosPares(int[] array) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int elemento : array) {
            if (mapa.containsKey(elemento)) {
                int quantidade = mapa.get(elemento);
                mapa.put(elemento, quantidade + 1);
            } else {
                mapa.put(elemento, 1);
            }
        }

        List<Integer> lista = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            int elemento = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade % 2 == 0) {
                lista.add(elemento);
            }
        }

        int[] resultado = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;
    }

}
