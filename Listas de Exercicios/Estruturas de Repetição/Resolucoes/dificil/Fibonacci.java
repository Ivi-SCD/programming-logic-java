
public class Fibonacci {

    public static void main(String[] args) {

        int [] fibonacciSequence = new int[10];
        
        for(int i = 0; i < 10; i++) {
            
            if(i >= 2) {
                fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];

                System.out.println("Indice (" + i + ") da sequencia fibonacci: " + fibonacciSequence[i]);
            } else {
                fibonacciSequence[i] = i;
                System.out.println("Indice (" + i + ") da sequencia fibonacci: " + fibonacciSequence[i]);
            }
        }
    }
}