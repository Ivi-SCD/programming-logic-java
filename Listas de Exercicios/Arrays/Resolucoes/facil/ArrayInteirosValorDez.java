package facil;

import java.util.Arrays;

public class ArrayInteirosValorDez {
    public static void main(String[] args) {
        int [] arrayInteiros = new int[6];
        Arrays.fill(arrayInteiros, 10);
        System.out.printf("Quarto elemento: %d", arrayInteiros[3]);
    }
}
