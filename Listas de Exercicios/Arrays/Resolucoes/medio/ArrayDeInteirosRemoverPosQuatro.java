package medio;

public class ArrayDeInteirosRemoverPosQuatro {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = 4; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = 0;
        for (int i:
             numbers) {
            System.out.println(i);
        }

    }
}
