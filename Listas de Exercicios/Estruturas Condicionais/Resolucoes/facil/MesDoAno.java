package facil;

import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido!");
        } else {
            System.out.println(meses[mes - 1]);
        }

        sc.close();
    }
}
