import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiferencaDatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira data no formato AAAA-MM-DD:");
        LocalDate data1 = LocalDate.parse(sc.nextLine());

        System.out.println("Digite a segunda data no formato AAAA-MM-DD:");
        LocalDate data2 = LocalDate.parse(sc.nextLine());

        long diferencaDias = ChronoUnit.DAYS.between(data1, data2);

        System.out.println("A diferença entre as datas é de " + Math.abs(diferencaDias) + " dias.");

        sc.close();
    }
}
