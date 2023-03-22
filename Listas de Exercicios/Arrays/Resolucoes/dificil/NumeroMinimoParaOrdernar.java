package dificil;

public class NumeroMinimoParaOrdernar {
    public static void main(String[] args) {
        int [] arrayNumeros = {1, 2, 3, 4, 10, 3, 7};
        System.out.println(minMovimentos(arrayNumeros));
    }

    public static int minMovimentos(int[] array) {
        int n = array.length;
        int movimentos = 0;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                    movimentos++;
                }
            }
        } while (trocou);

        return movimentos;
    }

}
