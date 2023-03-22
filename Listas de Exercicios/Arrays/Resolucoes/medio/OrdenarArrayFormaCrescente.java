package medio;

public class OrdenarArrayFormaCrescente {
    public static void main(String[] args) {
        int [] arrayInteiros = {1, 5, 3, 2, 4};

        int temp;
        for (int i = 0; i < arrayInteiros.length - 1; i++) {

            for (int j = i + 1; j < arrayInteiros.length; j++) {
                if (arrayInteiros[i] > arrayInteiros[j]) {
                    temp = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[j];
                    arrayInteiros[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado em ordem crescente: ");
        for (int numero : arrayInteiros) {
            System.out.print(numero + " ");
        }
    }
}
