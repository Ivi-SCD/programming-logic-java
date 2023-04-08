public class NumerosParesZeroAVinte {
    public static void main(String[] args) {

        System.out.println("Numeros pares de 0 a 20:0");
        for (int i = 0; i <= 20; i++) {
            
            if(i == 0 || i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
