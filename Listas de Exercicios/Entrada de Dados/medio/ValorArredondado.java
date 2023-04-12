import java.util.Scanner;

public class ValorArredondado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double num = sc.nextDouble();

        int valorArredondado = (int) Math.ceil(num);

        System.out.println("O valor arredondado para cima é: " + valorArredondado);

        sc.close();
    }
}
