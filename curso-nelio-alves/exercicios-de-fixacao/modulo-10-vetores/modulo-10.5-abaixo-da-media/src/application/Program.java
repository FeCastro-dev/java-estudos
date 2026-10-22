package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double media = 0.0;
        double vect[] = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            media += vect[i] / n;
        }

        System.out.println();
        System.out.print("MEDIA DO VETOR = " + media);
        
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i=0; i<n; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
                
            }
        }

        
        

        sc.close();
    }
}