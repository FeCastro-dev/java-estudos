package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double vect[] = new double[n];
        double numeroMaior = 0;
        int posicao = 0;

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            if (vect[i] > numeroMaior) {
                numeroMaior = vect[i];  
            } else if (vect[i] > i) {
                posicao = i;
            }    
        }

        System.out.println();
        System.out.print("MARIOR VALOR = " + numeroMaior);

        System.out.println();
        System.out.print("POSIÇÃO DO MARIOR VALOR = " + posicao);
        /*
        System.out.print("MAIOR VALOR = ");
            
        for (int i=0; i<n; i++) {
            if (vect[i] >= i) {
                System.out.print(numeroMaior);
            }
        }
 */
        sc.close();
    }
}
