package dificil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecebeDoisArraysRetornaUmArray {
    public static void main(String[] args) {

        List<Integer> arraysIntegersUm = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arraysIntegersDois = Arrays.asList(7, 1, 2, 3, 8);

        System.out.println(Arrays.toString(elementosNaoComuns(arraysIntegersUm, arraysIntegersDois)));


    }

    public static int[] elementosNaoComuns(List<Integer> array1, List<Integer> array2) {

        List<Integer> lista1 = new ArrayList<>(array1);

        List<Integer> lista2 = new ArrayList<>(array2);

        lista1.removeAll(lista2);

        int[] resultado = new int[lista1.size()];

        for (int i = 0; i < lista1.size(); i++) {
            resultado[i] = lista1.get(i);
        }

        return resultado;
    }
}
