import java.util.*;

public class resolucaoSemFor {
    public static void main(String[] args) {
        final int tamanho = 5;

        // Declaração dos arrays
        String[] nomes = new String[tamanho];
        float[] notaUm = new float[tamanho];
        float[] notaDois = new float[tamanho];
        float[] notaTres = new float[tamanho];

        // Armazenamento dos valores
        System.out.print("Digite o nome do aluno 1: ");
        Scanner sc = new Scanner(System.in);
        nomes[0] = sc.nextLine();

        System.out.print("Digite a nota da unidade 1 para o aluno " + nomes[0] + ": ");
        notaUm[0] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 2 para o aluno " + nomes[0] + ": ");
        notaDois[0] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 3 para o aluno " + nomes[0] + ": ");
        notaTres[0] = sc.nextFloat();

        System.out.print("Digite o nome do aluno 2: ");
        sc.nextLine();
        nomes[1] = sc.nextLine();

        System.out.print("Digite a nota da unidade 1 para o aluno " + nomes[1] + ": ");
        notaUm[1] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 2 para o aluno " + nomes[1] + ": ");
        notaDois[1] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 3 para o aluno " + nomes[1] + ": ");
        notaTres[1] = sc.nextFloat();

        System.out.print("Digite o nome do aluno 3: ");
        sc.nextLine();
        nomes[2] = sc.nextLine();

        System.out.print("Digite a nota da unidade 1 para o aluno " + nomes[2] + ": ");
        notaUm[2] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 2 para o aluno " + nomes[2] + ": ");
        notaDois[2] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 3 para o aluno " + nomes[2] + ": ");
        notaTres[2] = sc.nextFloat();

        System.out.print("Digite o nome do aluno 4: ");
        sc.nextLine();
        nomes[3] = sc.nextLine();

        System.out.print("Digite a nota da unidade 1 para o aluno " + nomes[3] + ": ");
        notaUm[3] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 2 para o aluno " + nomes[3] + ": ");
        notaDois[3] = sc.nextFloat();

        System.out.print("Digite a nota da unidade 3 para o aluno " + nomes[3] + ": ");
        notaTres[3] = sc.nextFloat();

        if (notaUm[0] > notaDois[0]) {
            float temp = notaUm[0];
            notaUm[0] = notaDois[0];
            notaDois[0] = temp;
        }
        if (notaUm[0] > notaTres[0]) {
            float temp = notaUm[0];
            notaUm[0] = notaTres[0];
            notaTres[0] = temp;
        }
        if (notaDois[0] > notaTres[0]) {
            float temp = notaDois[0];
            notaDois[0] = notaTres[0];
            notaTres[0] = temp;
        }

        if (notaUm[1] > notaDois[1]) {
            float temp = notaUm[1];
            notaUm[1] = notaDois[1];
            notaDois[1] = temp;
        }
        if (notaUm[1] > notaTres[1]) {
            float temp = notaUm[1];
            notaUm[1] = notaTres[1];
            notaTres[1] = temp;
        }
        if (notaDois[1] > notaTres[1]) {
            float temp = notaDois[1];
            notaDois[1] = notaTres[1];
            notaTres[1] = temp;
        }

        if (notaUm[2] > notaDois[2]) {
            float temp = notaUm[2];
            notaUm[2] = notaDois[2];
            notaDois[2] = temp;
        }
        if (notaUm[2] > notaTres[2]) {
            float temp = notaUm[2];
            notaUm[2] = notaTres[2];
            notaTres[2] = temp;
        }
        if (notaDois[2] > notaTres[2]) {
            float temp = notaDois[2];
            notaDois[2] = notaTres[2];
            notaTres[2] = temp;
        }

        if (notaUm[3] > notaDois[3]) {
            float temp = notaUm[3];
            notaUm[3] = notaDois[3];
            notaDois[3] = temp;
        }
        if (notaUm[3] > notaTres[3]) {
            float temp = notaUm[3];
            notaUm[3] = notaTres[3];
            notaTres[3] = temp;
        }
        if (notaDois[3] > notaTres[3]) {
            float temp = notaDois[3];
            notaDois[3] = notaTres[3];
            notaTres[3] = temp;
        }

        if (notaUm[4] > notaDois[4]) {
            float temp = notaUm[4];
            notaUm[4] = notaDois[4];
            notaDois[4] = temp;
        }
        if (notaUm[4] > notaTres[4]) {
            float temp = notaUm[4];
            notaUm[4] = notaTres[4];
            notaTres[4] = temp;
        }
        if (notaDois[4] > notaTres[4]) {
            float temp = notaDois[4];
            notaDois[4] = notaTres[4];
            notaTres[4] = temp;
        }
        
        // Apagando a ultima nota inserido do quinto aluno.
        notaTres[4] = 0;

        System.out.println("Nome do Aluno: " + nomes[0]);
        System.out.println("Nota Um: " + notaUm[0]);
        System.out.println("Nota Dois: " + notaDois[0]);
        System.out.println("Nota Tres: " + notaTres[0]);

        System.out.println("Nome do Aluno: " + nomes[1]);
        System.out.println("Nota Um: " + notaUm[1]);
        System.out.println("Nota Dois: " + notaDois[1]);
        System.out.println("Nota Tres: " + notaTres[1]);

        System.out.println("Nome do Aluno: " + nomes[2]);
        System.out.println("Nota Um: " + notaUm[2]);
        System.out.println("Nota Dois: " + notaDois[2]);
        System.out.println("Nota Tres: " + notaTres[2]);

        System.out.println("Nome do Aluno: " + nomes[3]);
        System.out.println("Nota Um: " + notaUm[3]);
        System.out.println("Nota Dois: " + notaDois[3]);
        System.out.println("Nota Tres: " + notaTres[3]);

        System.out.println("Nome do Aluno: " + nomes[4]);
        System.out.println("Nota Um: " + notaUm[4]);
        System.out.println("Nota Dois: " + notaDois[4]);
        System.out.println("Nota Tres: " + notaTres[4]);

        sc.close();
    }
}
