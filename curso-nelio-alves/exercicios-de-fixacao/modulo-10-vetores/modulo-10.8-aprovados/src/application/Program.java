package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int quantidade = sc.nextInt();
        String aluno[] = new String[quantidade];
        double nota1[] = new double[quantidade];
        double nota2[] = new double[quantidade];
        double media[] = new double[quantidade];

        for (int i=0; i<quantidade; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno");
            aluno[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<quantidade; i++) {
            if(media[i] >= 6) {
                System.out.println(aluno[i]);
            }
        }

        
        sc.close();
    }
}
