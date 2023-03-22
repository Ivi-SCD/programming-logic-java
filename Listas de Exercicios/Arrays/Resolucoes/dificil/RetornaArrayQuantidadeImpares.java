package dificil;

import java.util.*;

public class RetornaArrayQuantidadeImpares {
    public static void main(String[] args) {
        int [] arrayNumeros = {1, 3, 7, 4, 2, 3, 7};

        System.out.println(Arrays.toString(elementosImpares(arrayNumeros)));
    }
    public static int[] elementosImpares(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int valor : array) {
            if (map.containsKey(valor)) {
                map.put(valor, map.get(valor) + 1);
            } else {
                map.put(valor, 1);
            }
        }

        List<Integer> lista = new ArrayList<>();

        for (int valor : array) {
            if (map.get(valor) % 2 != 0) {
                lista.add(valor);
            }
        }

        int[] resultado = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;
    }

}
