package dificil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data no formato yyyy-mm-dd: ");
        String dateStr = sc.nextLine();
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("O dia da semana eh: " + date.getDayOfWeek().toString().toLowerCase());
    }
}

