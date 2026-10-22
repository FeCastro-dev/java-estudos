package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double vect[] = new double[n];
        double quantidade = 0;
        double media = 0.0;
        
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            if (vect[i]%2 == 0) {
                quantidade++;
            }
        }
        
        for (int i=0; i<n; i++){
            if (vect[i]%2 == 0) {
            media += vect[i] / quantidade;
            }
        }
        
    

        System.out.println();
        System.out.print("MEDIA DOS PARES = " + media);

        sc.close();
    }
}
