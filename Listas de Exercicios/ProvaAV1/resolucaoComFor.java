import java.util.*;

public class resolucaoComFor {
    public static void main(String[] args) {
        final int tamanho = 5;

        // Declaração dos arrays
        String[] nomes = new String[tamanho];
        float[] notaUm = new float[tamanho];
        float[] notaDois = new float[tamanho];
        float[] notaTres = new float[tamanho];

        Scanner sc = new Scanner(System.in);

        // Armazenamento dos valores
        for (int i = 0; i < tamanho; i++) {

            if(i!= 0) {
                sc.nextLine();
            }

            System.out.print("Digite o nome do aluno (" + (i+1) + "): ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a nota da unidade 1 para o aluno " + nomes[i] + ": ");
            notaUm[i] = sc.nextFloat();

            System.out.print("Digite a nota da unidade 2 para o aluno " + nomes[i] + ": ");
            notaDois[i] = sc.nextFloat();

            System.out.print("Digite a nota da unidade 3 para o aluno " + nomes[i] + ": ");
            notaTres[i] = sc.nextFloat();
        }

        // Ordenação das notas de cada aluno em ordem crescente
        for (int i = 0; i < tamanho; i++) {

            
            if (notaUm[i] > notaDois[i]) {
                float temp = notaUm[i];
                notaUm[i] = notaDois[i];
                notaDois[i] = temp;
            }
            if (notaDois[i] > notaTres[i]) {
                float temp = notaDois[i];
                notaDois[i] = notaTres[i];
                notaTres[i] = temp;
            }
            if (notaUm[i] > notaDois[i]) {
                float temp = notaUm[i];
                notaUm[i] = notaDois[i];
                notaDois[i] = temp;
            }
        }

        // Remoção da nota do último aluno
        notaTres[tamanho - 1] = 0.0f;

        //Exibição das notas
        for(int i = 0; i < tamanho; i++) {
            System.out.println("Nome do Aluno: " + nomes[i]);
            System.out.println("Nota Um: " + notaUm[i]);
            System.out.println("Nota Dois: " + notaDois[i]);
            System.out.println("Nota Tres: " + notaTres[i]);
        }

        sc.close();
    }
}
